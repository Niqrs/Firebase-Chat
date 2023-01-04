object Dependencies {

    object Kotlin {
        const val version = "1.7.21"
        val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object Android {
        const val gradlePlugin = "com.android.tools.build:gradle:8.0.0-alpha10"

        private const val activityComposeVersion = "1.6.1"
        private const val coreKtxVersion = "1.9.0"

        const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"
        const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
    }

    object Compose {
        const val compilerVersion = "1.4.0-alpha02"

        private const val version = "1.4.0-alpha03"
        private const val material3Version = "1.1.0-alpha03"

        const val animation = "androidx.compose.animation:animation:$version"
        const val foundation = "androidx.compose.foundation:foundation:$version"
        const val material3 = "androidx.compose.material3:material3:$material3Version"
        const val runtime = "androidx.compose.runtime:runtime:$version"
        const val ui = "androidx.compose.ui:ui:$version"
//        const val tooling = "androidx.compose.ui:ui-tooling:$version"
//        const val icons = "androidx.compose.material:material-icons-core:$version"
    }
}