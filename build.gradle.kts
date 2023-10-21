plugins {
    id("java")
}

group = "com.deecodeme.poc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.20")
    annotationProcessor("org.projectlombok:lombok:1.18.20")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

apply(from = "${rootDir}/libraries.gradle")

tasks.test {
    useJUnitPlatform()
}