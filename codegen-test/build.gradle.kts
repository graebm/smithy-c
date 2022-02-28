plugins {
    id("software.amazon.smithy") version "0.5.3"
}

val smithyVersion = "1.16.3"

group = "example"
version = "1.0-SNAPSHOT"

tasks["jar"].enabled = false

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":codegen"))
    implementation("software.amazon.smithy:smithy-model:$smithyVersion")
    implementation("software.amazon.smithy:smithy-aws-traits:$smithyVersion")
    implementation("software.amazon.smithy:smithy-waiters:$smithyVersion")
}
