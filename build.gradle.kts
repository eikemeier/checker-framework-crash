plugins {
  `java-library`

  id("org.checkerframework") version "0.6.16"
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(17))
    vendor.set(JvmVendorSpec.ADOPTIUM) // Eclipse Temurin
  }
}

checkerFramework {
  checkers = listOf("org.checkerframework.checker.nullness.NullnessChecker")
  extraJavacArgs = listOf("-AskipDefs=MapperImpl$$")
}

repositories {
  mavenCentral()
}

dependencies {
  checkerFramework("org.checkerframework:checker:3.25.0")

  annotationProcessor("org.immutables:value-processor:2.9.2")
  annotationProcessor("org.mapstruct:mapstruct-processor:1.5.2.Final")

  compileOnly("org.checkerframework:checker-qual:3.25.0")

  implementation("org.immutables:value-annotations:2.9.2")
  implementation("org.mapstruct:mapstruct:1.5.2.Final")
}
