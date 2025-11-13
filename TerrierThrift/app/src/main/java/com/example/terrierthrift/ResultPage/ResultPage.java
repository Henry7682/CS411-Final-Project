package com.example.terrierthrift.ResultPage;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Generic page of results paired with pagination info.
 * Example: ResultPage<Listing> for marketplace listings.
 */
public final class ResultPage<T> {
    private final List<T> items;
    private final PageInfo pageInfo;
    private final int totalMatches;

    public ResultPage(List<T> items, PageInfo pageInfo, int totalMatches) {
        this.items = Collections.unmodifiableList(Objects.requireNonNull(items, "items"));
        this.pageInfo = Objects.requireNonNull(pageInfo, "pageInfo");
        if (totalMatches < 0) throw new IllegalArgumentException("totalMatches must be >= 0");
        this.totalMatches = totalMatches;
    }

    /** Convenience factory for an empty page. */
    public static <T> ResultPage<T> empty() {
        return new ResultPage<>(Collections.<T>emptyList(), new PageInfo(), 0);
    }

    public List<T> getItems() {
        return items;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public int getTotalMatches() {
        return totalMatches;
    }

    /** Number of items in this page (not totalMatches). */
    public int size() {
        return items.size();
    }

    /** True if another page exists after this one. */
    public boolean hasNext() {
        return pageInfo.hasNext();
    }

    /** Pagination token to request the next page (may be empty). */
    public String nextToken() {
        return pageInfo.getToken();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResultPage)) return false;
        ResultPage<?> that = (ResultPage<?>) o;
        return totalMatches == that.totalMatches &&
               items.equals(that.items) &&
               pageInfo.equals(that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, pageInfo, totalMatches);
    }

    @Override
    public String toString() {
        return "ResultPage{" +
                "items(size)=" + items.size() +
                ", pageInfo=" + pageInfo +
                ", totalMatches=" + totalMatches +
                '}';
    }
}
