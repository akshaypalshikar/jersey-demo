package com.jersey.demo.jerseydemo.service;

import com.jersey.demo.jerseydemo.model.MyDataModel;

public interface DataService {
    MyDataModel getData(String id);
}
