package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ImageViewActivity extends AppCompatActivity {
    TextView txt_msg;
    Intent intent;
//4(15)
    Bundle get_bag;//接收
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        Button btn_back = findViewById(R.id.btnBack);
        txt_msg = findViewById(R.id.txtMsg);
//2(22改23)
        //intent = new Intent();
        //intent = getIntent();
//3(42又取代23)
        intent = new Intent();
        //使用bundle接收資料
//5(30-37)
        get_bag = getIntent().getExtras();
        String num = get_bag.getString("MSG");//變一個key
                   //就不是用intent,而是get_bag
        int salary = get_bag.getInt("SALARY");
        String name = get_bag.getString("NAME");
        String phone = get_bag.getString("PHONE");

        txt_msg.setText("姓名: "+name+"\n電話: "+phone+"\n"+num+salary);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent = new Intent();
                intent.setClass(ImageViewActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
