/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 */

// buildscript {
    
// }

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.

    val kotlin_version = "1.3.20"
    val shadow_version = "4.0.4"

    id("org.jetbrains.kotlin.jvm").version(kotlin_version)
    id("com.github.johnrengelman.shadow").version(shadow_version)

    // Apply the application plugin to add support for building a CLI application.
    application
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    mavenCentral()
    
}

dependencies {
    val ktor_version = "1.1.2"

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Ktor library.
    compile("io.ktor:ktor-server-core:$ktor_version")
    compile("io.ktor:ktor-server-netty:$ktor_version")
    // compile("io.ktor:ktor-gson:$ktor_version")
    compile("io.ktor:ktor-jackson:$ktor_version")

    // Exposed library.
    compile("org.jetbrains.exposed:exposed:0.12.1")
    compile("org.postgresql:postgresql:42.2.5")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    
}

application {
    // Define the main class for the application.
    mainClassName = "serverside.kotlin.AppKt"
}
