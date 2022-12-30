pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Firebase Chat"
include(":app")
include(":core")
include(":core-ui")
include(":auth:ui")
include(":auth:data")
include(":auth:domain")
include(":profile:ui")
include(":profile:data")
include(":profile:domain")
