package com.example.todoapi.service.sample;

import com.example.todoapi.repository.sample.SampleRecord;
import com.example.todoapi.repository.sample.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service // Bean(DI管理対象クラス)登録
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository repository;

    public SampleEntity find() {
        SampleRecord record = repository.select();
        return new SampleEntity(record.getContent());
    }
}
