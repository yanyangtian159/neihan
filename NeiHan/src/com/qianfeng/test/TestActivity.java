package com.qianfeng.test;



import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.qianfeng.bean.ImageEntity;
import com.qianfeng.neihan.R;
import com.qianfeng.neihan.client.ClientAPI;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * 
 * @author hanyang
 * 
 */
public class TestActivity extends Activity implements Response.Listener<String>{
	private static final int CATEGORY_TEXT = 1;
	public static final int CATEGORY_IMAGE = 2;
	private RequestQueue queue;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		int itemCount = 30;
		queue = Volley.newRequestQueue(this);
		ClientAPI.getList(queue,itemCount,CATEGORY_IMAGE,this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test, menu);
		return true;
	}

	@Override
	public void onResponse(String arg0) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			//Log.d("TestActivity", "list:" + arg0);
			try {
				JSONObject jsonObject=new JSONObject(arg0);
				arg0=jsonObject.toString(4);

				System.out.print("list:"+arg0);
				
				
				//获取根节点下面的data对象
				JSONObject obj=jsonObject.getJSONObject("data");
				JSONArray jsonArray=obj.getJSONArray("data");
				int len=jsonArray.length();
				if(len>0){
					for(int i=0;i<len;i++){
						JSONObject item=jsonArray.getJSONObject(i);
						ImageEntity imageEntity=new ImageEntity();
						imageEntity.parseJson(item);
					}
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

//	private List<String> pathImageUrlList(JSONObject largeimage) throws JSONException {
//		JSONArray urls=largeimage.getJSONArray("url_list");
//		List<String> largeImageUrls=new LinkedList<String>();
//		int ulen=urls.length();
//		for(int j=0;j<ulen;j++){
//			JSONObject uobj=urls.getJSONObject(j);
//			String url=uobj.getString("url");
//			largeImageUrls.add(url);
//		}
//		return largeImageUrls;
//	}

}
