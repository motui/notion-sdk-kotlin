import io.gitlab.arturbosch.detekt.Detekt
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun properties(key: String) = project.findProperty(key).toString()

plugins {
    // Java support
    id("java")
    // Kotlin support
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
    // detekt linter - read more: https://detekt.github.io/detekt/gradle.html
    id("io.gitlab.arturbosch.detekt") version "1.19.0"
    // ktlint linter - read more: https://github.com/JLLeitschuh/ktlint-gradle
    id("org.jlleitschuh.gradle.ktlint") version "10.2.1"
}

group = properties("group")
version = properties("version")

repositories {
    mavenCentral()
}

dependencies {
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.19.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

detekt {
    config = files("./detekt-config.yml")
    buildUponDefaultConfig = true
}

tasks {
    withType<JavaCompile> {
        sourceCompatibility = properties("jvmVersion")
        targetCompatibility = properties("jvmVersion")
        options.encoding = properties("encoding")
    }

    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = properties("jvmVersion")
    }

    withType<Detekt> {
        jvmTarget = properties("jvmVersion")
    }
}