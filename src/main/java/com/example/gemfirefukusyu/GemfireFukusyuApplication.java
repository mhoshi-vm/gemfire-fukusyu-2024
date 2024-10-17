package com.example.gemfirefukusyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.geode.config.annotation.EnableClusterAware;


@SpringBootApplication
@EnableClusterAware
public class GemfireFukusyuApplication {

    public static void main(String[] args) {
        SpringApplication.run(GemfireFukusyuApplication.class, args);
    }

}
