package com.easypan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAsync //异步
@SpringBootApplication(scanBasePackages = {"com.easypan"})
@EnableTransactionManagement // 事务
@EnableScheduling //定时任务
@MapperScan("com.easypan.mapper")
public class EasyPanApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyPanApplication.class,args);
    }
}
