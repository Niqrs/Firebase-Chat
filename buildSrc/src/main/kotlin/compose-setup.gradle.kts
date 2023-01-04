import gradle.kotlin.dsl.accessors._02a2388d87905d5afb86ef5bd9da0463.implementation
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
    implementation(Dependencies.Compose.material3)
    implementation(Dependencies.Compose.runtime)
    implementation(Dependencies.Compose.ui)
//        implementation(Dependencies.Android.Compose.ui)
//        implementation(Dependencies.Android.Compose.material)
//        implementation(Dependencies.Android.Compose.tooling)
//        implementation(Dependencies.Android.Compose.icons)
//        implementation(compose.runtime)
//        implementation(compose.foundation)
//        implementation(compose.material)
}