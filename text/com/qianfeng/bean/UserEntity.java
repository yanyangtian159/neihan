package com.qianfeng.bean;

import org.json.JSONObject;

public class UserEntity {
	private String _avatarUrl;
	/**
	 * 用户名称（昵称）
	 */
	private String _name;
	/**
	 * 用户id
	 */
	private long _userId;
	/**
	 * 用户是否实名认证，即加V
	 */
	private boolean _userUerified;

	/**
	 * "user": {"avatar_url": "http://p1.pstatp.com/thumb/1367/2213311454","user_id": 3080520868,"name": "请叫我梓安哥","user_verified": false},
	 */
	public void parseJson(JSONObject aJson) throws JSONException {
		throw new UnsupportedOperationException();
	}
}