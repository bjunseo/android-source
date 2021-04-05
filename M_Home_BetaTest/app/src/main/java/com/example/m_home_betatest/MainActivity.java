package com.example.m_home_betatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    

    public void onClick(View view){
        switch (view.getId())
        {
            case R.id.f:
                Toast.makeText(this.getApplicationContext(),"현재 페이지 입니다.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.s:
                Intent intent = new Intent(this, SubActivity.class);
                startActivity(intent);
                break;
        }

    }
}