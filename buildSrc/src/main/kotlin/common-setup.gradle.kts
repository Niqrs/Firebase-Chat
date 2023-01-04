import gradle.kotlin.dsl.accessors._02a2388d87905d5afb86ef5bd9da0463.kotlin

plugins {
    id("com.android.library")
}

kotlin {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }
}

dependencies {

}
