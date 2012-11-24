package com.example.aplikasibdm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdm);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_bdm, menu);
        return true;
    }
    
    
    public void keluar (View v){
    	finish();
    }
    
    public void toMateri(View v){
    	 Intent i = new Intent();
    	 i.setClass(this, MateriActivity.class);
    	 startActivity(i);
    	 
    }
    
}
