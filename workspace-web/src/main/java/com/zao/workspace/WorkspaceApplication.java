package com.zao.workspace;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zao.workspace.dao")
public class WorkspaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkspaceApplication.class, args);
    }

}
