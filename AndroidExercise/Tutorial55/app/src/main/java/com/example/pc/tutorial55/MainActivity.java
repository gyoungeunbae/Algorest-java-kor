package com.example.pc.tutorial55;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = {"mango","tomato","grape"};
        //ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        ListAdapter adapter = new ImageAdapter(this,  items);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        //listview가 들어감
        //item을 클릭했을 때 이벤트가 발생
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        String item = String.valueOf(parent.getItemAtPosition(i));
                        Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
                    }

                }
        );
    }
}
