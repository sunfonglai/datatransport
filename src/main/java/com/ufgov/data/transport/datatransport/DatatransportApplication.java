package com.ufgov.data.transport.datatransport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("com.ufgov.data.transport.datatransport.Mapper")
public class DatatransportApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatatransportApplication.class, args);
    }
}
