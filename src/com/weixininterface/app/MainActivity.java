package com.weixininterface.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Button;

import com.example.weixininterface.R;

public class MainActivity extends Activity {
	private ViewPager mViewPager;
	private FragmentPagerAdapter mAdapter;
	
	private Button weixin;
	private Button tongxun;
	private Button find;
	private Button me;
	
	private int currentIndex;//ViewPager的当前选中页
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		weixin = (Button) findViewById(R.id.weixin);
		tongxun = (Button) findViewById(R.id.tongxun);
		find = (Button) findViewById(R.id.find);
		me = (Button) findViewById(R.id.me);
		
		mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
		//注意这里
		mAdapter = new FragmentPagerAdapter(null) {
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Fragment getItem(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}


}
