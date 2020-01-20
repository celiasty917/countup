//
// Created by Song Tianyi on 20/1/20.
//

#include<jni.h>
#include<string.h>
#include <stdio.h>
///*
JNIEXPORT jint JNICALL Java_rakuten_countup_MainActivity_addcount(JNIEnv * env, jobject obj, jint num, jint one) {

    jint result;
    result = num+one;

    return result;
}
// */
/*
jstring Java_rakuten_countup_MainActivity_addcount(JNIEnv * env, jobject obj, jint num, jint one) {

    jint result= num+one;
    char str[64];
    sprintf(str, "%d", result);

    return (*env)->NewStringUTF(env, str);

}
 */