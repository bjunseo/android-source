package com.example.m_home_betatest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {
    TextView textView;
    Switch mySwitch;
    int now_temp = 30;
    boolean sta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        textView = (TextView) findViewById(R.id.Temp_V);
        textView.setText(Integer.toString(now_temp));

        TextView t = (TextView) findViewById(R.id.sta);

        mySwitch = (Switch) findViewById(R.id.sta_s);
        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true)
                {
                    sta = true;
                    t.setText("true");
                }
                else
                {
                    sta = false;
                    t.setText("false");
                }
            }
        });


    }

    public void onClick(View view){
        if(sta == true) {
            switch (view.getId()) {
                case R.id.f:
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.s:
                    Toast.makeText(this.getApplicationContext(), "현재 페이지 입니다.", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Temp_U:
                    now_temp++;
                    textView.setText(Integer.toString(now_temp));
                    break;
                case R.id.Temp_M:
                    now_temp--;
                    textView.setText(Integer.toString(now_temp));
                    break;
            }
        }
        else {

        }
    }
}
