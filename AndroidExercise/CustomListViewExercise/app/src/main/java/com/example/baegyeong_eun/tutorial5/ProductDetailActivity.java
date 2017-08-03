package com.example.baegyeong_eun.tutorial5;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import entities.*;
import android.content.*;
import android.widget.*;
public class ProductDetailActivity extends AppCompatActivity {

    private Button buttonBack;
    private TextView textViewName;
    private TextView textViewPrice;
    private TextView textViewId;
    private ImageView imageViewPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        Intent intent = getIntent();
        Product product = (Product) intent.getSerializableExtra("product");

        this.buttonBack = (Button)findViewById(R.id.Back);
        this.buttonBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductDetailActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        this.textViewId = (TextView) findViewById(R.id.textViewId);
        this.textViewId.setText(product.getId());
        this.textViewName = (TextView) findViewById(R.id.textViewName);
        this.textViewName.setText(product.getName());
        this.textViewPrice = (TextView) findViewById(R.id.textViewPrice);
        this.textViewPrice.setText((CharSequence) product.getPrice());
        this.imageViewPhoto = (ImageView) findViewById(R.id.imageViewPhoto);
        this.imageViewPhoto.setImageResource(product.getPhoto());


    }

}
