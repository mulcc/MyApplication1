package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = findViewById(R.id.btn_test);
        final TextView tv = findViewById(R.id.tv_ans);
        final RadioGroup rg = findViewById(R.id.rg);
        final ImageView iv = findViewById(R.id.iv_1);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText("求是创新！");
                Log.i("MainActivity", "onClick: 输出答案");
            }
        });


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbt_1:
                        tv.setText("回答正确！");
                        Log.i("MainActivity", "onCheckedChanged: 选项1");
                        break;
                    case R.id.rbt_2:
                        tv.setText("回答错误！");
                        Log.i("MainActivity", "onCheckedChanged: 选项2");
                        break;
                    case R.id.rbt_3:
                        tv.setText("回答错误！");
                        Log.i("MainActivity", "onCheckedChanged: 选项3");
                        break;
                }
            }
        });
    }


}
