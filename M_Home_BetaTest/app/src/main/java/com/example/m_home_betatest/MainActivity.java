package com.example.m_home_betatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> item = new ArrayList<String>();
        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, item);

        final ListView listview = (ListView) findViewById(R.id.list_view) ;
        listview.setAdapter(adapter) ;

        count = adapter.getCount();
        item.add("LIST" + Integer.toString(count + 1));
        adapter.notifyDataSetChanged();
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