plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("maven-publish")
}
android {
    namespace = "com.example.loginappmodule"
    compileSdk = 35

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}
publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.github.Mukesh1198"
            artifactId = "loginappModule"
            version = "1.0.1"

            pom {
                name.set("My Library")
                description.set("A sample library for demonstration")
                url.set("https://github.com/mukeshkumar1198/LoginApp")

                licenses {
                    license {
                        name.set("Apache-2.0")
                        url.set("https://opensource.org/licenses/Apache-2.0")
                    }
                }
                developers {
                    developer {
                        id.set("Mukesh1198")
                        name.set("Mukesh")
                        email.set("mukesh.k@tamilzorous.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/mukeshkumar1198/LoginApp.git")
                    developerConnection.set("scm:git:ssh://github.com/mukeshkumar1198/LoginApp.git")
                    url.set("https://github.com/mukeshkumar1198/LoginApp")
                }
            }
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}