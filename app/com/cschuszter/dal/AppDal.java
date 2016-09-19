package com.cschuszter.dal;

/**
 * Created by cristian.schuszter on 9/19/2016.
 */

import com.cschuszter.models.MyEntity;
import com.google.inject.ImplementedBy;

@ImplementedBy(AppDalImpl.class)
public interface AppDal {
    public MyEntity getEntity(String name);
}
