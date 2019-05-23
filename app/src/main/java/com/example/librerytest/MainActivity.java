package com.example.librerytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.blackmambalibrary.Mymath;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText secondvalue,etfirstvalue;
    Button btnplus,btnminus,btnmultiply,btndevide;
    TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();

        //clickListner
        btndevide.setOnClickListener(this);
        btnminus.setOnClickListener(this);
        btnmultiply.setOnClickListener(this);
        btnplus.setOnClickListener(this);
    }

    private void bindViews() {

        secondvalue=findViewById(R.id.secondvalue);
        etfirstvalue=findViewById(R.id.etfirstvalue);
        btnplus=findViewById(R.id.btnplus);
        btnminus=findViewById(R.id.btnminus);
        btnmultiply=findViewById(R.id.btnmultiply);
        btndevide=findViewById(R.id.btndevide);
        tvresult=findViewById(R.id.tvresult);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnplus:

                int a= Integer.parseInt(etfirstvalue.getText().toString());
                int b= Integer.parseInt(secondvalue.getText().toString());
                tvresult.setText(String.valueOf(Mymath.plus(a,b)));
                break;

            case R.id.btnminus:

                int a1= Integer.parseInt(etfirstvalue.getText().toString());
                int b1= Integer.parseInt(secondvalue.getText().toString());
                tvresult.setText(String.valueOf(Mymath.minus(a1,b1)));
                break;

            case R.id.btnmultiply:

                int a2= Integer.parseInt(etfirstvalue.getText().toString());
                int b2= Integer.parseInt(secondvalue.getText().toString());
                tvresult.setText(String.valueOf(Mymath.multiply(a2,b2)));
                break;

            case R.id.btndevide:

                int a3= Integer.parseInt(etfirstvalue.getText().toString());
                int b3= Integer.parseInt(secondvalue.getText().toString());
                tvresult.setText(String.valueOf(Mymath.devide(a3,b3)));
                break;
        }
    }
}
