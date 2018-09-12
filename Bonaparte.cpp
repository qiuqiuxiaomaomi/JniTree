#include "Application.h"
#include <stdio.h>
#include <jni.h>

JNIEXPORT void JNICALL Java_Application_calcunatePonaparte(JNIEnv *, jobject){
      printf("ponaparte!\n");
      return;
  }