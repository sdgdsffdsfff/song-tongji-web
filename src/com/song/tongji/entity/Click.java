package com.song.tongji.entity;

import java.util.Date;

/**
 * 点击记录
 * 
 * @author songzigw
 *
 */
public class Click implements java.io.Serializable {

	private static final long serialVersionUID = 4598086399339422894L;

	/** 添加时间 */
	private Date addTime;
	/** 用户ID */
	private Long userId;
	/** 数据库 */
	private String dbName;
	/** 数据表 */
	private String dtName;
	/** 表主键ID */
	private String pkId;
	/** 表字段名 */
	private String fieldKey;
	/** 表字段值 */
	private String fieldValue;
	/** 客户端类型 */
	private String clientType;
	/** 客户端版本 */
	private String clientVersion;
	/** 客户端IP */
	private String clientIp;
	/** 客户端地理位置 */
	private String clientPosition;

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDtName() {
		return dtName;
	}

	public void setDtName(String dtName) {
		this.dtName = dtName;
	}

	public String getPkId() {
		return pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public String getFieldKey() {
		return fieldKey;
	}

	public void setFieldKey(String fieldKey) {
		this.fieldKey = fieldKey;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getClientPosition() {
		return clientPosition;
	}

	public void setClientPosition(String clientPosition) {
		this.clientPosition = clientPosition;
	}
}
