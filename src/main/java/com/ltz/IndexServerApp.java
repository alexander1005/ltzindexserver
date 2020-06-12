package com.ltz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@EnableFeignClients(basePackages = "com.ltz.service.feign") // Feign  扫描
@EnableDiscoveryClient
@ComponentScan("com.ltz")
public class IndexServerApp {

  public static void main(String[] args) {
    SpringApplication.run(IndexServerApp.class, args);
  }
}
