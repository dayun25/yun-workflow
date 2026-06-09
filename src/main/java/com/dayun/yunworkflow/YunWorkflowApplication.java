package com.dayun.yunworkflow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dayun.yunworkflow.mapper")
public class YunWorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunWorkflowApplication.class, args);
        System.out.println(
                """
                
                ====================================
                ====== code-generator 启动成功！======
                ====================================
                
                """);
    }

}
