plugins {
    //trick: for the same plugin versions in all sub-modules
    kotlin("android") version "1.8.10" apply false
    kotlin("multiplatform") version "1.8.10" apply false
    kotlin("plugin.serialization") version "1.8.10" apply false
    id("app.cash.sqldelight") version "2.0.0-alpha05" apply false
    id("com.android.application") version "7.4.2" apply false
    id("com.android.library") version "7.4.2" apply false
    id("org.jetbrains.compose") version "1.3.1" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
