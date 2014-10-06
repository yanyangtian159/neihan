package com.qianfeng.neihan;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Transformation;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private Button button1,button2,button3,button4,button5;
	private FragmentManager manager;
	private Transformation transformation;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1=(Button)this.findViewById(R.id.duanzi);
		button2=(Button)this.findViewById(R.id.tupian);
		button3=(Button)this.findViewById(R.id.shenhe);
		button4=(Button)this.findViewById(R.id.huodong);
		button5=(Button)this.findViewById(R.id.wode);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.duanzi){
			button1.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_tab_essay_off_night, 0, 0);//R.drawable.ic_tab_essay_off_night
			button1.setTextColor(Color.WHITE);
		
		}else{
			button1.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_tab_essay_on_night, 0, 0);//R.drawable.ic_tab_essay_off_night
			button1.setTextColor(Color.GRAY);
		}
		if(v.getId()==R.id.tupian){
			button2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_tab_image_off_night, 0, 0);//R.drawable.ic_tab_essay_off_night
			button2.setTextColor(Color.WHITE);
		}else{
			button2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_tab_image_on_night, 0, 0);//R.drawable.ic_tab_essay_off_night
			button2.setTextColor(Color.GRAY);
		}
		
	}

}
