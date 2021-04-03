package com.appmob.appmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void clickHospital(View view) {
        //klik gambar dokter
        Intent a = new Intent(this, Hospital.class);
        startActivity(a);
    }

    public void clickPolice(View view) {
        //klik gambar polisi
        Intent b = new Intent(this, Kantor_Polisi.class);
        startActivity(b);
    }

    public void clickMall(View view) {
        //klik gambar shopping bag
        Intent c = new Intent(this, Mall.class);
    }

    public void clickUniversitas(View view) {
        //klik gambar dinding jendela
        Intent d = new Intent(this, Universitas.class);
    }
}