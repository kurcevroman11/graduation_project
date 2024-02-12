import com.example.taskmaster.Configuration
import com.example.taskmaster.Deps
import com.example.taskmaster.Versions
import com.example.taskmaster.AndroidDependencies

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
    implementation(project(mapOf("path" to ":shared")))

    implementation(AndroidDependencies.androidCore)
    implementation(AndroidDependencies.appCompat)

    implementation(AndroidDependencies.material)

    implementation(AndroidDependencies.composeUi)
    implementation(AndroidDependencies.composeMaterial)
    implementation(AndroidDependencies.composeTooling)
    implementation(AndroidDependencies.composeConstraint)
    implementation(AndroidDependencies.composeLiveData)
    implementation(AndroidDependencies.composeActivity)

    implementation(AndroidDependencies.lifeCycleRuntime)

    // Koin-Dependency injection
    implementation(AndroidDependencies.koinAndroid)
    implementation(AndroidDependencies.koinCompose)

    // Accompanist Libs
    implementation(AndroidDependencies.accompanistNavigationAnimation)

    // Splash Screen API
    implementation(AndroidDependencies.splashScreen)

    // Coil-Image Loader
    implementation(AndroidDependencies.coil)

    // Compose Navigation-Navigation between various screens
    implementation(AndroidDependencies.navigation)

    coreLibraryDesugaring(AndroidDependencies.desugaring)

    // Lottie Compose
    implementation(AndroidDependencies.lottie)

    // Koin
    with(Deps.Koin) {
        api(android)
        api(koinCompose)
    }
}