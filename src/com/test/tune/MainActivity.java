package com.test.tune;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		this.addContentView(new TuneWheel(this, null), new LinearLayout.LayoutParams(-1, -1));
	}
	
}
