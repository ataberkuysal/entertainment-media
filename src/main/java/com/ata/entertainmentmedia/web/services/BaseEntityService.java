package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.entities.BaseEntity;
import com.ata.entertainmentmedia.data.repos.BaseEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseEntityService {

    @Autowired
    BaseEntityRepo baseEntityRepo;

    public List<BaseEntity> getEntities(){
        return baseEntityRepo.findAll();
    }
}
