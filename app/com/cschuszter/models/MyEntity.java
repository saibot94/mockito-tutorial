package com.cschuszter.models;

/**
 * Created by cristian.schuszter on 9/19/2016.
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MyEntity {
    @Getter
    @Setter
    private String name;
}
