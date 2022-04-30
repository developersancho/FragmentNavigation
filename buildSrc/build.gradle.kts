plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
    implementation("com.android.tools.build:gradle:7.1.3")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:1.6.10")
    implementation("org.jetbrains.dokka:dokka-core:1.6.10")
    implementation("com.vanniktech:gradle-maven-publish-plugin:0.19.0")
}