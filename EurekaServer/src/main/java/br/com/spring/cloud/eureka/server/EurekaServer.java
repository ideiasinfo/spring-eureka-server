package br.com.spring.cloud.eureka.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.client.ConfigServicePropertySourceLocator;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    private static final Logger logger = LoggerFactory.getLogger(EurekaServer.class);

    public static void main(String[] args) {
        logger.info("EurekaServer - Starting...");

        // Tell server to look for config-server.properties or eureka-server.yml
        System.setProperty("spring.config.name", "eureka-server");

        // Start the Server
        SpringApplication.run(EurekaServer.class, args);
    }

}
