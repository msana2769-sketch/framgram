plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.framgram.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.framgram.app"
        minSdk = 23
        targetSdk = 35
        versionCode = 1

    kotlinOptions {
        jvmTarget = "17"
    }
}