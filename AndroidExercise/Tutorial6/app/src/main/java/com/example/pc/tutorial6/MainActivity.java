package com.example.pc.tutorial6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nameText = (EditText) findViewById(R.id.nameText);
        //사용자가 이름을 입력하면 값을 저장하는 객체
        Button nameButton = (Button) findViewById(R.id.nameButton);

        nameButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name = nameText.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                //Intent는 새로운 창을 열기 위해서 필요한 객체
                intent.putExtra("nameText",name);//변수를 보내기
                startActivity(intent);//실행

            }

        });
    }
}
