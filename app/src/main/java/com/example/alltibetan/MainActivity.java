package com.example.alltibetan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoNextpage(View view){
        Intent nextPage = new Intent(MainActivity.this, option2.class);
        startActivity(nextPage);
    }

}
