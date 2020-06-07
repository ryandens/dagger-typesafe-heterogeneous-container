plugins {
    id("com.diffplug.gradle.spotless") version "3.28.1"
}

allprojects {
    apply(plugin = "com.diffplug.gradle.spotless")
    apply<JavaPlugin>()
    spotless {
        java {
            removeUnusedImports()
            googleJavaFormat()
        }
        kotlinGradle {
            ktlint()
        }
    }

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

subprojects {
    repositories {
        mavenCentral()
    }
}
