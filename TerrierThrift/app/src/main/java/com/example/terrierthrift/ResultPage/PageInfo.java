package com.example.terrierthrift.ResultPage;

import java.util.Objects;

/**
 * Immutable pagination descriptor used by ResultPage.
 * pageNumber is 1-based.
 */
public final class PageInfo {
    private final int pageNumber;
    private final boolean hasNext;
    private final String token;

    /** Default: first page, no next page, empty token. */
    public PageInfo() {
        this(1, false, "");
    }

    public PageInfo(int pageNumber, boolean hasNext, String token) {
        if (pageNumber < 1) throw new IllegalArgumentException("pageNumber must be >= 1");
        this.pageNumber = pageNumber;
        this.hasNext = hasNext;
        this.token = token == null ? "" : token;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public boolean hasNext() {
        return hasNext;
    }

    public String getToken() {
        return token;
    }

    /** True if this represents the first page (1-based). */
    public boolean isFirst() {
        return pageNumber <= 1;
    }

    /** True if there is no next page. */
    public boolean isLast() {
        return !hasNext;
    }

    /**
     * Returns a new PageInfo advanced to the next page with updated token/hasNext.
     */
    public PageInfo withNext(String token, boolean hasNext) {
        return new PageInfo(this.pageNumber + 1, hasNext, token);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PageInfo)) return false;
        PageInfo that = (PageInfo) o;
        return pageNumber == that.pageNumber &&
               hasNext == that.hasNext &&
               Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageNumber, hasNext, token);
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "pageNumber=" + pageNumber +
                ", hasNext=" + hasNext +
                ", token='" + token + '\'' +
                '}';
    }
}
