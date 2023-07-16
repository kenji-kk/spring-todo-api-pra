package com.example.todoapi.service.sample;

import org.springframework.stereotype.Service;

@Service // Bean(DI管理対象クラス)登録
public class SampleService {

    public SampleEntity find() {
        return new SampleEntity("Hello");
    }
}
