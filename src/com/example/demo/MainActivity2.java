package com.example.demo;

import android.app.TabActivity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity2 extends TabActivity {
	
	private TabHost tabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tabHost=getTabHost();
		
	}

	
	private void addTab(String tag, CharSequence label, int id){
		//创建新的标签
		TabSpec tabSpec=tabHost.newTabSpec(tag);
		tabSpec.setIndicator(label, getResources().getDrawable(id));
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
