plugins {
    application
}

application {
    mainClassName = "com.github.ryandens.dagger.thc.Main"
}

dependencies {
    val daggerVersion = "2.27"
    implementation("com.google.dagger", "dagger", daggerVersion)
    annotationProcessor("com.google.dagger", "dagger-compiler", daggerVersion)
    val autoValueVersion = "1.7.1"
    implementation("com.google.auto.value", "auto-value-annotations", autoValueVersion)
    annotationProcessor("com.google.auto.value", "auto-value", autoValueVersion)
}
