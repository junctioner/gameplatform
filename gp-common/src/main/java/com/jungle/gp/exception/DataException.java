/**
 * Project Name:gp-exception
 * File Name:DataException.java
 * Package Name:com.jungle.gp.exception
 * Date:2018年2月24日下午3:50:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.exception;
/**
 * Description:   <br/>
 * Date:     2018年2月24日 下午3:50:06 <br/>
 * @author   thinkpad
 * @version
 * @see
 */
public class DataException extends RuntimeException {

    /**
     * serialVersionUID:
     */
    private static final long serialVersionUID = 605230405764467937L;

    public DataException() {
    }

    public DataException(String message) {
        super(message);
    }

    public DataException(Throwable cause) {
        super(cause);
    }

    public DataException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

