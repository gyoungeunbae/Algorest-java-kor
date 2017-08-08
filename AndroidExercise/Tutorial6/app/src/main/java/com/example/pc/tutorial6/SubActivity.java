package com.example.pc.tutorial6;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by PC on 2017-08-08.
 */
//새로운 창이기 때문에 AppcompatActivity라는 상위 클래스를 상속 받는다.
public class SubActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sub);//layout
        TextView nameText = (TextView) findViewById(R.id.nameText);
        Intent intent = getIntent();
        nameText.setText(intent.getStringExtra("nameText").toString());
        //String으로 변환되어 nameText로 들어간다
    }
}
