package com.qianfeng.neihan.client;

import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.qianfeng.test.TestActivity;

/**
 * 所有和服务器接口对接的方法，全部在这个类里面
 * @author hanyang
 *
 */
public class ClientAPI {

	public ClientAPI() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取内涵段子列表内容
	 * @param queue Volley 请求的队列
	 * @param responseListener 用于获取内涵段子列表的毁掉接口，任何调用getlist方法时，此参数用于更新段子列表
	 * @param itemCount  获取参数类型
	 * @param categoryType 服务器依稀传回的条目数
	 * @author #CATEGORY_TEXT
	 * @see TestActivity#CATEGORY_IMAGE
	 */
	
	public static void getList(RequestQueue queue,int itemCount, int categoryType,Response.Listener<String> responseListener) {
		// TODO 测试内涵段子的列表接口，获取文本列表
		
		//RequestQueue queue = Volley.newRequestQueue(this);
	
		String CATEGORY_LIST_API = "http://ic.snssdk.com/2/essay/zone/category/data/";
		String categroyInfo = "category_id=" + categoryType;
		String countParam = "count=" + itemCount;
		String deviceType = "device_type=KFTT";
		String udid = "&openudid=b90ca6a3a19a78d6";
		String url = CATEGORY_LIST_API
	
				+ "?"
				+ categroyInfo
				+ "&"
				+ countParam
				+ "&"
				+ deviceType
				+ "&"
				+ udid
				+ "&level=6&iid=2337593504&device_id=2757969807&ac=wifi&channel=wandoujia&aid=7&app_name=joke_essay&version_code=302&device_platform=android&os_api=15&os_version=4.0.3";
	
		
		queue.add(new StringRequest(Method.GET, url, responseListener, new Response.ErrorListener() {
	
			@Override
			public void onErrorResponse(VolleyError arg0) {
				// TODO Auto-generated method stub
	
			}
		}));
		queue.start();
	}

}
