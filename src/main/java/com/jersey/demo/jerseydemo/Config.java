package com.jersey.demo.jerseydemo;

import com.jersey.demo.jerseydemo.controller.DataController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class Config extends ResourceConfig {

    public void jerseyConfig()
    {
        register(DataController.class);
    }
}
