package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  Tcb主站，管理人部分的服务
 */
@SpringBootApplication
public class TcbManageStarter {

    public static void main(String[] args) {
        try {
            SpringApplication.run(TcbManageStarter.class);
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

}
