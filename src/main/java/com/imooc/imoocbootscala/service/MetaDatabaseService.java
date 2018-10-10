package com.imooc.imoocbootscala.service;

import com.imooc.imoocbootscala.domain.MetaDatabase;
import com.imooc.imoocbootscala.repository.MetaDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MetaDatabaseService {

    @Autowired
    private MetaDatabaseRepository metaDatabaseRepository;

    @Transactional
    public void save(MetaDatabase metaDatabase){
        metaDatabaseRepository.save(metaDatabase);
    }

    public Iterable<MetaDatabase> query(){
        return metaDatabaseRepository.findAll();
    }

}
