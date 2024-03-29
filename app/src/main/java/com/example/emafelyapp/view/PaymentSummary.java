package com.example.emafelyapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.emafelyapp.R;

public class PaymentSummary extends AppCompatActivity {


    private LinearLayout mainPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_summary);

        inItView();
        inItListener();
    }

    public void inItView() {
        mainPage = findViewById(R.id.layout_main_page);

    }

    public void inItListener() {
        mainPage();
    }

    private void mainPage() {
        mainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(PaymentSummary.this,MainPage1.class);
                startActivity(myIntent);
            }
        });
    }


}