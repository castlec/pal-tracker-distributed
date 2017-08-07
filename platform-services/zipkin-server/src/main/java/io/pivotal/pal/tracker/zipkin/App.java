package io.pivotal.pal.tracker.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.annotation.ComponentScan;
import zipkin.server.EnableZipkinServer;

/**
 * Created by accenturelabs on 8/7/17.
 */
@SpringBootApplication
@ComponentScan("io.pivotal.pal.tracker.zipkin")
@EnableZipkinServer
@EnableZipkinStreamServer
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
