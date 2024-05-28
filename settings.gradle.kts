pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "Tix"
include(":app")
include(":core:data")
include(":core:work")
include(":core:local")
include(":core:model")
include(":core:common")
include(":feature:nowplaying")
include(":feature:popular")
include(":feature:toprated")
include(":feature:upcoming")
include(":core:ui")
