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
public class ResultPage<T> extends ResultList<T> {

    public ResultPage() {
        super();
    }

    public ResultPage(List<T> data) {
        super(data);
    }

    /**
     * 总记录数
     */
    private int total;
    /**
     * 每页记录数
     */
    private int size;
    /**
     * 当前页数
     */
    private int curPage;
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
