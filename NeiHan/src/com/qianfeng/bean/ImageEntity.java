package com.qianfeng.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class ImageEntity {

	private static int type;
	private static int commentCount;
	private static Long groupId;
	private static String content;
	private static ImageUrlList largeList;
	private static ImageUrlList middleimage;

	public void parseJson(JSONObject item) throws JSONException{
		type = item.getInt("type");
		
		JSONObject group=item.getJSONObject("group");
		
		commentCount = group.getInt("comment_count");
		
		JSONObject largeimage=group.getJSONObject("large_image");
		
		JSONObject middleImage=group.getJSONObject("middle_image");
		
		groupId = group.getLong("group_id");
		
		content = group.getString("content");
		
		largeList = new ImageUrlList();
		
		largeList.parseJson(largeimage);
		
		
		middleimage = new ImageUrlList();
		
		middleimage.parseJson(middleImage);
	}

}
