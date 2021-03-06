package com.example.m_home_betatest;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Struct;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    ListViewBtnAdapter mMyAdapter;
    int count;
    boolean[] sta = {false,false,false,false};
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text_);
        // items 로드.
        /* 위젯과 멤버변수 참조 획득 */
        mListView = (ListView)findViewById(R.id.list_view);

        /* 아이템 추가 및 어댑터 등록 */
        dataSetting();

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                sta[position] = !sta[position];
            }
        });
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

    private void dataSetting() {

        ListViewBtnAdapter mMyAdapter = new ListViewBtnAdapter();

        mMyAdapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.light_bulb), "light bulb", "");
        mMyAdapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.door), "door", "");
        mMyAdapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.window), "window", "");
        mMyAdapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.curtain), "curtain", "");

        /* 리스트뷰에 어댑터 등록 */
        mListView.setAdapter(mMyAdapter);
    }
}