package com.test.helloeeg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity{
	
	private EditText account;
	private EditText password;
	
	private Button confirm;
	private Button cancel;

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        confirm = (Button)findViewById(R.id.login_but_confirm);
        
        confirm.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		
        		Intent intent_login_activity = new Intent();
				intent_login_activity.setClass(LoginActivity.this, MainActivity.class);
				startActivity(intent_login_activity);
        	}
        	
        });
        
	}
}
