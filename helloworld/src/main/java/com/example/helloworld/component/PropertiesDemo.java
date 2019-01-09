package com.example.helloworld.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Authod shawn
 * @create 2019/1/8 0008
 */
@Component
public class PropertiesDemo {

    @Value("${com.shawn.name}")
    private String name;
    @Value("${com.shawn.title}")
    private String title;
    @Value("${server.port}")
    private String port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
