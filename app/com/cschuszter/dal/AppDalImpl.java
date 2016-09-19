package com.cschuszter.dal;

import com.cschuszter.models.MyEntity;

/**
 * Created by cristian.schuszter on 9/19/2016.
 */
public class AppDalImpl implements AppDal {
    @Override
    public MyEntity getEntity(String name) {
        return new MyEntity(name);
    }
}
