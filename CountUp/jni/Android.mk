LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := countup
LOCAL_SRC_FILES := countup.c

include $(BUILD_SHARED_LIBRARY)