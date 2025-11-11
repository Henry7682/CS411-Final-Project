plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.terrierthrift"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.terrierthrift"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    // PayPal Checkout SDK
    implementation("com.paypal.checkout:android-sdk:1.3.0")
    // Braintree SDK (for Venmo)
    implementation("com.braintreepayments.api:drop-in:6.12.0")
}