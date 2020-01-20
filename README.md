# countup
The app will count up from 0 when user taps the button "COUNT UP".
The logic uses NDK and the file is in jni folder. The function "Java_rakuten_countup_MainActivity_addcount(JNIEnv * env, jobject obj, jint num, jint one)" takes the current count as input, adds 1 to the count and return the value.
