/**
 * Project Name:gp-exception
 * File Name:BizException.java
 * Package Name:com.jungle.gp
 * Date:2018年2月24日下午3:44:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.exception;
/**
 * Description:   <br/>
 * Date:     2018年2月24日 下午3:44:32 <br/>
 * @author   thinkpad
 * @version
 * @see
 */
public class BizException extends Exception{

    /**
     * serialVersionUID:
     */
    private static final long serialVersionUID = -3717471806314066272L;

    public BizException() {
        super();
    }

    public BizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

}

