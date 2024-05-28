plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    alias(libs.plugins.kotlinx.serialization)
}

android {
    namespace = "com.arthlimchiu.core.work"
    compileSdk = 34

    defaultConfig {
        minSdk = 30
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":core:model"))
    implementation(project(":core:local"))
    implementation(project(":core:common"))

    // Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)
    implementation(libs.hilt.work)
    ksp(libs.hilt.compiler)

    // Kotlinx Serialization
    implementation(libs.kotlinx.serialization.json)

    // Work
    implementation(libs.androidx.work)
}