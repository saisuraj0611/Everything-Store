package com.example.everythingstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BuyerLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_login);

        Button otpButton=findViewById(R.id.get_otp_button);
        otpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(BuyerLogin.this, OtpBuyerActivty.class);
                startActivity(i);

            }
        });

        TextView register = findViewById(R.id.register_text_view);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(BuyerLogin.this, BuyerRegister.class);
                startActivity(i);

            }
        });
    }


}