package com.jersey.demo.jerseydemo.controller;

import com.jersey.demo.jerseydemo.model.MyDataModel;
import com.jersey.demo.jerseydemo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;


public class DataController {

    @Autowired
    DataService dataService;
    @GET
    @Path("/data")
    @Produces("application/json")
    public MyDataModel getData(String id){
        return dataService.getData(id);
    }
}
