/**
 * Project Name:gp-um-web
 * File Name:ResData.java
 * Package Name:com.jungle.gp.ro
 * Date:2018年2月24日下午4:20:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.ro;

/**
 * Description: <br/>
 * Date: 2018年2月24日 下午4:20:39 <br/>
 * 
 * @author thinkpad
 * @version
 * @see
 */
public class ResultData<T> extends Result {

    public ResultData() {
        super();
        this.setStatus(true);
    }

    public ResultData(T data) {
        this();
        this.data = data;
    }

    private T data;

    public T getData() {
        return data;
    }
}
