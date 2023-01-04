plugins {
    id("android-setup")
    id("compose-setup")
}

android {
    namespace = ProjectConfig.namespace("core_ui")
}

dependencies {
    implementation(Dependencies.Android.coreKtx)
}