package com.cschuszter.services;

import com.cschuszter.dal.AppDal;
import com.cschuszter.models.MyEntity;
import com.google.inject.Inject;
import lombok.Setter;
import lombok.val;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cristian.schuszter on 9/19/2016.
 */

public class EntityServiceImpl implements EntityService {
    @Inject
    @Setter
    private AppDal dal;

    @Override
    public List<MyEntity> getEntities() {
        val list = new ArrayList<MyEntity>();
        list.add(dal.getEntity("Ion"));
        list.add(dal.getEntity("Gheorghe"));
        list.add(dal.getEntity("Mihai"));

        return list;
    }
}