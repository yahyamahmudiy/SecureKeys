//
// Created by User on 07/05/2022.
//

#include "native_lib.h"
#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_example_securekey_ApplicationClass_stringFromJNI(JNIEnv *env, jobject object) {
    std::string hello = "Hello from Jni";
    return env->NewStringUTF(hello.c_str());
}
