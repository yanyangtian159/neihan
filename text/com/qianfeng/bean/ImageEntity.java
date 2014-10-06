package com.qianfeng.bean;

import org.json.JSONObject;

public class ImageEntity implements DuanziEntity {
	private static int _type;
	private static int _commentCount;
	private static Long _groupId;
	private static String _content;
	private static ImageUrlList _largeList;
	private static ImageUrlList _middleimage;
	private Object _userEntity;

	public void parseJson(JSONObject aItem) throws JSONException {
		throw new UnsupportedOperationException();
	}
}