package com.example.baegyeong_eun.tutorial5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;
import android.view.View;
import android.widget.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import entities.*;
import adapters.*;

public class MainActivity extends AppCompatActivity {
    private ListView listViewProducts;
    private List<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        products = new ArrayList<Product>();
        products.add(new Product("p01","Product 1",R.drawable.cham, BigDecimal.valueOf(100)));
        products.add(new Product("p02","Product 2",R.drawable.doll, BigDecimal.valueOf(200)));
        products.add(new Product("p03","Product 3",R.drawable.um, BigDecimal.valueOf(300)));

        this.listViewProducts = (ListView) findViewById(R.id.listViewProducts);
        this.listViewProducts.setAdapter(new ProductListAdapter(this,products));
        this.listViewProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Product product = products.get(i);
            //Toast.makeText(getApplicationContext(),product.getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ProductDetailActivity.class);
            intent.putExtra("product", product);
            startActivity(intent);
                                                         }

                                                     }

        );
    }
}
