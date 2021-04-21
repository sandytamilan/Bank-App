package com.example.bankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.util.Util;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    public static final String KEY = "Details";
    private TextView txtname;
    private Button button;
    private EditText edit;
    private CheckBox box;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initview();

        ArrayList<Beneficiary> details =new ArrayList<>();
        details.add(new Beneficiary("Vinoth",112233,"sbin001122"));
        details.add(new Beneficiary("Edwin",112234,"sbin001122"));
        details.add(new Beneficiary("Sasi",112235,"sbin009988"));
        details.add(new Beneficiary("Kumar",112236,"sbin009977"));
        details.add(new Beneficiary("Fahideen",112237,"sbin009977"));

        Intent intent = getIntent();
            if (null != intent){
                int ac=intent.getIntExtra(KEY,-1);
                if(ac != -1){
                    for(Beneficiary b:details)
                    {
                        if(b.getAc()==ac)
                        {
                            setname(b);
                        }
                    }
                }
            }

    }
    private void setname(Beneficiary b)
    {
        txtname.setText(b.getName());
    }

    private void initview() {
        txtname=findViewById(R.id.textView7);
        button=findViewById(R.id.button3);
        edit=findViewById(R.id.editTextNumber);
        box=findViewById(R.id.checkBox);
    }
}