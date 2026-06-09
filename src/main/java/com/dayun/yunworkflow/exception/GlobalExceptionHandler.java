package com.dayun.yunworkflow.exception;

import com.dayun.yunworkflow.common.BaseResponse;
import com.dayun.yunworkflow.common.enums.ErrorCode;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 */
@RestControllerAdvice // 全局拦截
@Hidden // spring boot和openApi3的knife4j不兼容，文档页面报异常；该注解让 OpenAPI/Swagger 扫描器跳过这个类，不要生成文档
// 这不是 bug，是 SpringDoc 的实现选择：它会把 Spring 容器中加了 @ResponseBody 相关注解的组件都当成潜在的 API 端点来扫描，而 @RestControllerAdvice 恰好满足这个特征。
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("BusinessException: ", e);
        return BaseResponse.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> RuntimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException: ", e);
        return BaseResponse.error(ErrorCode.SYSTEM_ERROR, e.getMessage());
    }
}
