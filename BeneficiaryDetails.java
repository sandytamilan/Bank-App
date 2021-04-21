package com.example.bankapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class BeneficiaryDetails extends AppCompatActivity {
    private RecyclerView Recycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficiary_details);
        Recycle=findViewById(R.id.Recycle);

        ArrayList<Beneficiary> details =new ArrayList<>();
        details.add(new Beneficiary("Vinoth",112233,"sbin001122"));
        details.add(new Beneficiary("Edwin",112234,"sbin001122"));
        details.add(new Beneficiary("Sasi",112235,"sbin009988"));
        details.add(new Beneficiary("Kumar",112236,"sbin009977"));
        details.add(new Beneficiary("Fahideen",112237,"sbin009977"));


        Adapter adp=new Adapter();
        adp.setName(details);
        Recycle.setAdapter(adp);
        Recycle.setLayoutManager(new LinearLayoutManager(this));
    }
}