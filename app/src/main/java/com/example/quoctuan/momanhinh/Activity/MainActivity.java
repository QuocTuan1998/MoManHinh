package com.example.quoctuan.momanhinh.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.quoctuan.momanhinh.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyMoManHinh(View view) {
//      khởi tạo Intent (Màn hình hiện tại(Tên Activity.this),
//      Màn hình muốn mở(Tên Activiti.class))
        Intent intent = new Intent(MainActivity.this,ManHinh2Activity.class);
//      Gởi lệnh tới android system
        startActivity(intent);
    }
}
