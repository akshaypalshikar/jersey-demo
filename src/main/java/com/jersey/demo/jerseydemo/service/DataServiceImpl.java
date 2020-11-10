package com.jersey.demo.jerseydemo.service;

import com.jersey.demo.jerseydemo.model.MyDataModel;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.util.Random;

@Service
public class DataServiceImpl implements DataService {

    @Override
    public MyDataModel getData(String id){
        MyDataModel myDataModel = new MyDataModel();
        myDataModel.setId(id);
        myDataModel.setName(getRandomString(10));
        myDataModel.setField1(getRandomString(100));
        myDataModel.setField2(getRandomString(100));
        return myDataModel;
    }

    String getRandomString(int length){
        byte[] array = new byte[length];
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
}
