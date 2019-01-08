package com.example.test.demo.mysql.dao;

import com.example.test.demo.mysql.model.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestConfigService {
    private TestConfig elkConfig;

    @Autowired
    public TestConfigService(TestConfig elkConfig){
        // 如果是初始化时就需要调用，则要把它放在构造函数中
        this.elkConfig = elkConfig;
    }

    public String toConfig(){
        return elkConfig.toString();
    }
}
