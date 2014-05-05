package com.test.helloeeg;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StartActivity extends Activity{
	
	Button but_login;
	Button but_register;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        but_login = (Button)findViewById(R.id.start_but_login);
        but_register = (Button)findViewById(R.id.start_but_register);
 
        
        but_login.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		
        		Intent intent_start_activity = new Intent();
				intent_start_activity.setClass(StartActivity.this, LoginActivity.class);
				startActivity(intent_start_activity);
        	}
        	
        });
        
        
        
        
	}

}
