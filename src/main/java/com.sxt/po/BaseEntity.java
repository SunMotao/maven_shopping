package com.sxt.po;

import java.io.Serializable;

/**
 * Created by 57056 on 2018/1/13.
 */
public class BaseEntity<T> implements Serializable {
    private T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
