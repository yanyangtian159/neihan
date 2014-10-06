package com.qianfeng.bean;

import org.json.JSONObject;

/**
 * wen ben duan zi shi ti
 * @author hanyang
 */
public class TextEntity implements DuanziEntity {
	private int _type;
	private long _createTime;
	private int _favoriteCount;
	/**
	 * zan de ge shu
	 */
	private int _userBury;
	/**
	 * dai biao dang qian yong hu shu fou cai le 0 dai biao mei you 1dai biao cai le
	 */
	private int _userFavorite;
	/**
	 * dai baio de shi dang qian de yong hu shi fou zan le 0 dai biao mei you 1dai biao zan le
	 */
	private int _buryCount;
	/**
	 * cai de ge shu
	 */
	private String _shareUrl;
	/**
	 * 用于第三方分享，提交的网�?���?
	 */
	private int _label;
	/**
	 * TODO 分析这个字段的含�?
	 */
	private String _content;
	/**
	 * 文本段子的内容（完整的内容）      换行问题
	 */
	private int _commentCount;
	/**
	 * 评论的个�?
	 */
	private int _status;
	/**
	 * 状�?，其中的可�?�?  ，分析中。�?�?
	 */
	private String _statusDesc;
	/**
	 * 状�?的描述，可�?�?
	 */
	private int _hasComments;
	/**
	 * 当前用户是否评论
	 */
	private int _goDetailCount;
	/**
	 * TODO�?��分析这个字段的含�?
	 * TODO �?��去了解digg到底是什么含�?
	 */
	private int _userDigg;
	private int _diggCount;
	/**
	 * digg的个�?
	 */
	private long _groupId;
	/**
	 * TODO 这个�?��分析是什么含义，现在有两个地方参�?
	 * 1、获取列表接口level=6
	 * 2、当前的文本段子实体中，level=4
	 */
	private int _level;
	private int _userRepin;
	/**
	 * 代表用户是否
	 */
	private int _repinCount;
	/**
	 * TODO 分析含义
	 */
	private int _hasHotComments;
	/**
	 * 是否含有热门评论
	 */
	private int _categoryId;
	/**
	 * TODO �?��去分析comments这个Json数组中的内容是什�?
	 */
	private long _onlineTime;
	/**
	 * 上线时间
	 */
	private long _displayTime;
	/**
	 * 显示时间
	 */
	private UserEntity _userEntity;

	public void parseJson(JSONObject aJson) throws JSONException {
		throw new UnsupportedOperationException();
	}

	public int getUserPepin() {
		throw new UnsupportedOperationException();
	}

	public int getType() {
		return this._type;
	}

	public long getCreateTime() {
		return this._createTime;
	}

	public int getFavoriteCount() {
		return this._favoriteCount;
	}

	public int getUserBury() {
		return this._userBury;
	}

	public int getUserFavorite() {
		return this._userFavorite;
	}

	public int getBuryCount() {
		return this._buryCount;
	}

	public String getShareUrl() {
		return this._shareUrl;
	}

	public int getLabel() {
		return this._label;
	}

	public String getContent() {
		return this._content;
	}

	public int getCommentCount() {
		return this._commentCount;
	}

	public int getStatus() {
		return this._status;
	}

	public String getStatusDesc() {
		return this._statusDesc;
	}

	public int getHasComments() {
		return this._hasComments;
	}

	public int getGoDetailCount() {
		return this._goDetailCount;
	}

	public int getUserDigg() {
		return this._userDigg;
	}

	public int getDiggCount() {
		return this._diggCount;
	}

	public long getGroupId() {
		return this._groupId;
	}

	public int getLevel() {
		return this._level;
	}

	public int getRepinCount() {
		return this._repinCount;
	}

	public int getHasHotComments() {
		return this._hasHotComments;
	}

	public int getCategoryId() {
		return this._categoryId;
	}

	public long getOnlineTime() {
		return this._onlineTime;
	}

	public long getDisplayTime() {
		return this._displayTime;
	}

	public UserEntity getUserEntity() {
		return this._userEntity;
	}
}