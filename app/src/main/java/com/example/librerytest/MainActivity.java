package com.example.librerytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.blackmambalibrary.interfaces.OnRangeSeekbarChangeListener;
import com.example.blackmambalibrary.widgets.BlackmambaRangebar;

public class MainActivity extends AppCompatActivity {

    BlackmambaRangebar blackmambaRangebar;
    TextView tvstartvalue,tvstopvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();

        blackmambaRangebar.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {

                tvstartvalue.setText(String.valueOf(minValue));
                tvstopvalue.setText(String.valueOf(maxValue));
            }
        });

    }
    private void bindViews() {
        blackmambaRangebar =findViewById(R.id.rangeseekbar);
        tvstartvalue=findViewById(R.id.tvstartvalue);
        tvstopvalue=findViewById(R.id.tvstopvalue);

    }

}
