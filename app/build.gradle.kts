plugins {
    alias(libs.plugins.android.application)
    id ("com.google.gms.google-services")
}

android {
    namespace = "com.expert.chatapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.expert.chatapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"


    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation (libs.recyclerview)
    implementation (libs.cardview)
    implementation (libs.material)

    implementation (libs.firebase.firestore)
    implementation (libs.firebase.messaging)
    implementation (platform(libs.firebase.bom))
    implementation (libs.firebase.analytics)
    implementation(libs.swiperefreshlayout)

}