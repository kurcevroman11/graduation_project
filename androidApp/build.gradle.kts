import com.example.taskmaster.Configuration
import com.example.taskmaster.Deps
import com.example.taskmaster.Versions

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.taskmaster.android"
    compileSdk = Configuration.compileSdk
    defaultConfig {
        applicationId = "com.example.taskmaster.android"
        minSdk = Configuration.minSdk
        targetSdk = Configuration.targetSdk
        versionCode = Configuration.versionCode
        versionName = Configuration.versionName
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
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
    implementation(project(":shared"))
    implementation("androidx.activity:activity-compose:1.6.1")

    // Koin
    with(Deps.Koin) {
        api(android)
    }
}