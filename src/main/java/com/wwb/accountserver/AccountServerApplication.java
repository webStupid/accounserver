package com.wwb.accountserver;

import com.wwb.commonbase.feign.EnableCustomFeignRequestInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author weibo
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableCustomFeignRequestInterceptor
public class AccountServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServerApplication.class, args);
    }

}
