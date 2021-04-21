package com.example.bankapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView Recycle2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Recycle2=findViewById(R.id.Recycle2);
        ArrayList<Beneficiary> details =new ArrayList<>();
        details.add(new Beneficiary("Vinoth",112233,"sbin001122"));
        details.add(new Beneficiary("Edwin",112234,"sbin001122"));
        details.add(new Beneficiary("Sasi",112235,"sbin009988"));
        details.add(new Beneficiary("Kumar",112236,"sbin009977"));
        details.add(new Beneficiary("Fahideen",112237,"sbin009977"));


        Adapter2 adp2=new Adapter2(this);
        Recycle2.setAdapter(adp2);
        Recycle2.setLayoutManager(new LinearLayoutManager(this));
        adp2.setName(details);
    }
}