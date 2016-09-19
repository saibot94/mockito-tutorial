package com.cschuszter.services;

import com.cschuszter.models.MyEntity;
import com.google.inject.ImplementedBy;

import java.util.List;

/**
 * Created by cristian.schuszter on 9/19/2016.
 */

@ImplementedBy(EntityServiceImpl.class)
public interface EntityService {
    public List<MyEntity> getEntities();
}
