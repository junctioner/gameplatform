/**
 * Project Name:gp-um-web
 * File Name:ResData.java
 * Package Name:com.jungle.gp.ro
 * Date:2018年2月24日下午4:20:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.ro;

import java.util.List;

/**
 * Description: <br/>
 * Date: 2018年2月24日 下午4:20:39 <br/>
 * 
 * @author thinkpad
 * @version
 * @see
 */
public class ResultList<T> extends Result {

    public ResultList() {
        super();
        this.setStatus(true);
    }

    public ResultList(List<T> data) {
        this();
        this.data = data;
    }

    private List<T> data;

    public List<T> getData() {
        return data;
    }
}
