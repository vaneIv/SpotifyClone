object Versions {
    val activityKtxVersion = "1.7.2"
    val androidXVersion = "1.0.0"
    val androidXLegacySupport = "1.0.0"
    val androidXTestCoreVersion = "1.5.0"
    val androidXTestExtKotlinRunnerVersion = "1.1.5"
    val androidxHiltCompiler = "1.0.0"
    val androidXAnnotations = "1.6.0"
    val appCompatVersion = "1.6.1"
    val lifecycleVersion = "2.6.1"
    val coroutinesVersion = "1.7.1"
    val dexMakerVersion = "2.28.1"
    val espressoVersion = "3.5.1"
    val exoPlayerVersion = "2.19.1"
    val fragmentVersion = "1.5.7"
    val firebaseFirestoreVersion = "24.9.1"
    val firebaseStorageKtxVersion = "20.3.0"
    val firebaseCoroutinesVersion = "1.7.1"
    val glideVersion = "4.14.2"
    val hamcrestVersion = "1.3"
    val hiltVersion = "2.48.1"
    val junitVersion = "4.13.2"
    val materialVersion = "1.9.0"
    val mockitoVersion = "4.11.0"
    val mockkVersion = "1.13.7"
    val navigationVersion = "2.6.0"
    val rulesVersion = "1.0.1"
    val swipeRefreshLayoutVersion = "1.1.0"
    val timberVersion = "5.0.1"
    val kotlinVersion = "1.9.0"
}

object Libs {
    // Kotlin
    val kotlin_std_lib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
    val fragment = "androidx.fragment:fragment-ktx:${Versions.fragmentVersion}"

    // App dependencies
    val app_compat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    val androidx_annotations = "androidx.annotation:annotation:${Versions.androidXAnnotations}"
    val androidx_legacy = "androidx.legacy:legacy-support-v4:${Versions.androidXLegacySupport}"

    // Material Design
    val material_design = "com.google.android.material:material:${Versions.materialVersion}"

    // Architectural Components
    val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"

    // Lifecycle
    val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycleVersion}"
    val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}"
    val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycleVersion}"

    // Activity KTX for viewModels()
    val activityKtx = "androidx.activity:activity-ktx:${Versions.activityKtxVersion}"

    // Coroutines
    val coroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"

    // Navigation Components
    val navigationFragmentKtx =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"

    //Dagger - Hilt
    val hilt = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"

    //implementation "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
    val androidxHiltCompiler = "androidx.hilt:hilt-compiler:${Versions.androidxHiltCompiler}"

    // Firebase Firestore
    val firebaseFirestore =
        "com.google.firebase:firebase-firestore:${Versions.firebaseFirestoreVersion}"

    // Firebase Storage Ktx
    val firebaseStorageKtx =
        "com.google.firebase:firebase-storage-ktx:${Versions.firebaseStorageKtxVersion}"

    // Firebase Coroutines
    val firebaseCoroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.firebaseCoroutinesVersion}"

    // Glide
    val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"

    // Timber
    val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"

    // ExoPlayer
    val exoPlayerCore = "com.google.android.exoplayer:exoplayer-core:${Versions.exoPlayerVersion}"
    val exoPlayerUi = "com.google.android.exoplayer:exoplayer-ui:${Versions.exoPlayerVersion}"
    val exoPlayerMediaSession =
        "com.google.android.exoplayer:extension-mediasession:${Versions.exoPlayerVersion}"
}

object ConfigVersions {
    val compileSdkVersion = 33
    val minSdkVersion = 24
    val targetSdkVersion = 33
}