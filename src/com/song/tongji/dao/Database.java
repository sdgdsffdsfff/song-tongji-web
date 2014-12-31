package com.song.tongji.dao;

import com.song.commons.dao.Fields;
import com.song.commons.dao.Tables;

public abstract class Database {

	public static enum Taozhe implements Tables {
		/** 点击 */
		TJI_CLICK,
	}
	
	/**
	 * 点击表字段
	 * @author songzigw
	 *
	 */
	public static enum ClickF implements Fields {
		/** 添加时间 */
		ADD_TIME,
		/** 用户ID */
		USER_ID,
		/** 数据库 */
		DB_NAME,
		/** 数据表 */
		DT_NAME,
		/** 表主键ID */
		PK_ID,
		/** 表字段名 */
		FIELD_KEY,
		/** 表字段值 */
		FIELD_VALUE,
		/** 客户端类型 */
		CLIENT_TYPE,
		/** 客户端版本 */
		CLIENT_VERSION,
		/** 客户端IP */
		CLIENT_IP,
		/** 客户端地理位置 */
		CLIENT_POSITION,
	}
}
