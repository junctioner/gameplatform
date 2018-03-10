package com.jungle.gp.user.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable{
    
    private static final long serialVersionUID = -4654614736345157814L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 手机号
	 */
	@Column(name="abc")
	private String mobile;

	/**
	 * 昵称
	 */
	private String name;

	/**
	 * 微信号
	 */
	private String weixinId;

	/**
	 * 卡数
	 */
	private int cardNum;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeixinId() {
		return weixinId;
	}

	public void setWeixinId(String weixinId) {
		this.weixinId = weixinId;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

    @Override
    public String toString() {
        return String.format("User [id=%s, mobile=%s, name=%s, weixinId=%s, cardNum=%s]", id, mobile, name, weixinId,
                cardNum);
    }

}
