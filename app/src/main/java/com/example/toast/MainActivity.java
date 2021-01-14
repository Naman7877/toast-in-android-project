package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button defaultGravity;
    Button singleGravity;
    Button nestedGravity;
    Button sampleToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defaultGravity=findViewById(R.id.defaultBut);
        singleGravity=findViewById(R.id.singleGravity);
        nestedGravity=findViewById(R.id.nestedGravity);
        sampleToast=findViewById(R.id.smapleTosat);

        defaultGravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "default Toast ", Toast.LENGTH_SHORT).show();
            }
        });

        singleGravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast toast= Toast.makeText(MainActivity.this,"this is single gravity toast ",Toast.LENGTH_LONG);
               toast.setGravity(Gravity.CENTER,0,0);
               toast.show();
            }
        });

        nestedGravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(MainActivity.this,"this is nested toast",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT,0,0);
                toast.show();

            }
        });
        sampleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(MainActivity.this,"this is sample Toast ",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM |Gravity.TOP |Gravity.RIGHT|Gravity.LEFT,0,0);
                toast.show();
                //xoffset mean x rase and yoffset mean y rase
            }
        });


    }
}