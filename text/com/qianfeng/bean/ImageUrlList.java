package com.qianfeng.bean;

import java.util.List;
import org.json.JSONObject;

public class ImageUrlList {
	private java.util.List<String> _largeImageUrls;
	private String _uri;
	private int _width;
	private int _height;

	public void parseJson(JSONObject aJson) throws JSONException {
		throw new UnsupportedOperationException();
	}

	private java.util.List<String> pathImageUrlList(JSONObject aLargeimage) throws JSONException {
		throw new UnsupportedOperationException();
	}

	public java.util.List<String> getLargeImageUrls() {
		return this._largeImageUrls;
	}

	public String getUri() {
		return this._uri;
	}

	public int getWidth() {
		return this._width;
	}

	public int getHeight() {
		return this._height;
	}
}