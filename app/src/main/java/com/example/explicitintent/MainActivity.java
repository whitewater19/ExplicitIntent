package com.example.explicitintent;
//銜接switchtest(傳值少),bundle傳值較多
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_next = findViewById(R.id.btnNext);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
//1(23-27)
                Bundle bag = new Bundle();
                bag.putString("MSG","本月薪資:");
                bag.putInt("SALARY",50000);
                bag.putString("NAME","王小明");
                bag.putString("PHONE","0988444555");

                intent.putExtras(bag);
//                intent.putExtra("MSG","本月薪資:");
//                intent.putExtra("SALARY",50000);
                intent.setClass(MainActivity.this,ImageViewActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
