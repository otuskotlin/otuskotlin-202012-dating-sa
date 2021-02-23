plugins {
    kotlin("jvm")
}

group = rootProject.group
version = rootProject.version

dependencies {
    val slf4jVersion: String by project
    val junitBomVersion: String by project

    implementation(kotlin("stdlib"))
    implementation("org.slf4j:slf4j-api:$slf4jVersion")

    testImplementation(kotlin("test-junit5"))
    testImplementation(platform("org.junit:junit-bom:$junitBomVersion"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
