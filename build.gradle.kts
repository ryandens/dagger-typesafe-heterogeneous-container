plugins {
    id("com.diffplug.spotless") version "5.1.1"
}

allprojects {
    apply(plugin = "com.diffplug.spotless")
    apply<JavaPlugin>()
    spotless {
        kotlinGradle {
            ktlint()
        }
    }

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_14
        targetCompatibility = JavaVersion.VERSION_14
    }

    tasks.withType<JavaCompile>() {
        options.compilerArgs.add("--enable-preview")
    }

    tasks.withType<JavaExec>() {
        jvmArgs = listOf("--enable-preview")
    }
}

subprojects {
    repositories {
        mavenCentral()
    }
}
