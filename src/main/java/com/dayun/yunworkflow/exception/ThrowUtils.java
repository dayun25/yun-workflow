package com.dayun.yunworkflow.exception;

import com.dayun.yunworkflow.common.enums.ErrorCode;

/**
 * 异常工具类
 * 用Utils而不是Util，Spring、Apache等主流开源项目的命名约定
 */
public class ThrowUtils {

    /**
     * 条件成立则抛出异常
     *
     * @param condition
     * @param runtimeException
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition, new BusinessException(errorCode, message));
    }
}
