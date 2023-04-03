# Kotlin_Room_Dagger2_MVVM






 //Room database
    def room_version = "2.5.1"
    implementation "androidx.room:room-runtime:$room_version"
    annotationProcessor "androidx.room:room-compiler:$room_version"
// To use Kotlin annotation processing tool (kapt)
    kapt "androidx.room:room-compiler:$room_version"

    //dagger 2.45
    implementation 'com.google.dagger:dagger:2.45'
    annotationProcessor 'com.google.dagger:dagger-compiler:2.45'
    implementation 'com.google.dagger:dagger-android:2.45'
    implementation 'com.google.dagger:dagger-android-support:2.45' //
    kapt "com.google.dagger:dagger-compiler:2.45"
    kapt "com.google.dagger:dagger-android-processor:2.45"
    annotationProcessor 'com.google.dagger:dagger-android-processor:2.45'


    implementation "androidx.lifecycle:lifecycle-viewmodel:2.6.1"
    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
    annotationProcessor 'androidx.lifecycle:lifecycle-compiler:2.2.0'
