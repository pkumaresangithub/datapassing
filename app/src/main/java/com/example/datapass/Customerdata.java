package com.example.datapass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Customerdata extends AppCompatActivity {
    TextView name,building,district,city,country,pincode,contact,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerdata);

        name = findViewById(R.id.txt_name);
        building = findViewById(R.id.txt_building);
        district = findViewById(R.id.txt_district);
        city = findViewById(R.id.txt_city);
        contact = findViewById(R.id.txt_contact);
        country = findViewById(R.id.txt_country);
        email = findViewById(R.id.txt_email);
        pincode = findViewById(R.id.txt_pincode);

        Intent intent = getIntent();

        String NAME= intent.getStringExtra("namekey");
        name.setText(NAME);
        String BUILDING= intent.getStringExtra("buildingkey");
        building.setText(BUILDING);
        String DISTRICT= intent.getStringExtra("districtkey");
        district.setText(DISTRICT);
        String CITY= intent.getStringExtra("citykey");
        city.setText(CITY);
        String CONTACT= intent.getStringExtra("contactkey");
        contact.setText(CONTACT);

        String COUNTRY= intent.getStringExtra("countrykey");
        country.setText(COUNTRY);

        String PINCODE= intent.getStringExtra("pincodekey");
        pincode.setText(PINCODE);

        String EMAIL= intent.getStringExtra("emailkey");
        email.setText(EMAIL);


    }
}