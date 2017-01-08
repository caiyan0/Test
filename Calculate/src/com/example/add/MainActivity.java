package com.example.add;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText first,second;
	Button add;
	TextView result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		first = (EditText)findViewById(R.id.first);
		second = (EditText)findViewById(R.id.second);
		add = (Button)findViewById(R.id.add);
		result = (TextView)findViewById(R.id.result);
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s1 = first.getText().toString();
				String s2 = second.getText().toString();
				int re = Integer.parseInt(s1) + Integer.parseInt(s2);
				result.setText(String.valueOf(re));
			}
		});
	}
}
