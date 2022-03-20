package com.example.datapass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,building,district,city,country,pincode,contact,email;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        building = findViewById(R.id.building);
        city = findViewById(R.id.city);
        district = findViewById(R.id.district);
        country = findViewById(R.id.country);
        pincode = findViewById(R.id.pincode);
        contact = findViewById(R.id.contact);
        email = findViewById(R.id.email);
        send = findViewById(R.id.btnsend);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String NAME = name.getText().toString();
                String BUILDING = building.getText().toString();
                String CITY = city.getText().toString();
                String DISTRICT = district.getText().toString();
                String COUNTRY = country.getText().toString();
                String PINCODE = pincode.getText().toString();
                String COMTACT = contact.getText().toString();
                String EMAIL = email.getText().toString();

                Intent intent = new Intent(MainActivity.this,Customerdata.class);

                intent.putExtra("namekey",NAME);
                intent.putExtra("buildingkey",BUILDING);
                intent.putExtra("citykey",CITY);
                intent.putExtra("districtkey",DISTRICT);
                intent.putExtra("countrykey",COUNTRY);
                intent.putExtra("pincodekey",PINCODE);
                intent.putExtra("contactkey",COMTACT);
                intent.putExtra("emailkey",EMAIL);

                startActivity(intent);


            }
        });


    }
}