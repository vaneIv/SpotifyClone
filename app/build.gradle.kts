plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt")
    id("com.google.dagger.hilt.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.spotifyclone"
    compileSdk = ConfigVersions.compileSdkVersion

    defaultConfig {
        applicationId = "com.example.spotifyclone"
        minSdk = ConfigVersions.minSdkVersion
        targetSdk = ConfigVersions.targetSdkVersion
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Libs.kotlin_std_lib)
    implementation(Libs.fragment)
    implementation(Libs.app_compat)
    //implementation(Libs.androidx_annotations)
    implementation(Libs.androidx_legacy)

    // Material design
    implementation(Libs.material_design)

    // Architectural components
    implementation(Libs.viewmodelKtx)
    implementation(Libs.livedataKtx)
    implementation(Libs.lifecycleRuntime)
    implementation(Libs.runtimeKtx)
    implementation(Libs.lifecycleCompiler)

    // Activity Ktx for viewModels()
    implementation(Libs.activityKtx)

    // Coroutines
    implementation(Libs.coroutines)
    implementation(Libs.coroutinesCore)

    // Navigation components
    implementation(Libs.navigationFragmentKtx)
    implementation(Libs.navigationUiKtx)

    // Dagger - Hilt
    implementation(Libs.hilt)
    implementation(Libs.hiltCompiler)
    kapt(Libs.androidxHiltCompiler)

    // Firebase Firestore
    implementation(Libs.firebaseFirestore)

    // Firebase Storage KTX
    implementation(Libs.firebaseStorageKtx)

    // Firebase Coroutines
    implementation(Libs.firebaseCoroutines)


    // Glide
    implementation(Libs.glide)
    kapt(Libs.glideCompiler)

    // Timber
    implementation(Libs.timber)

    // ExoPlayer
    implementation(Libs.exoPlayerCore)
    implementation(Libs.exoPlayerUi)
    implementation(Libs.exoPlayerMediaSession)
}

// Non-existent type correction. Needed for Hilt.
kapt {
    correctErrorTypes = true
}