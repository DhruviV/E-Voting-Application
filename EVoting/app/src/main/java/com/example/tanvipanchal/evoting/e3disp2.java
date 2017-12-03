package com.example.tanvipanchal.evoting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class e3disp2 extends Activity {
    TextView ttv1,ttv2,ttv3,ttv4,ttv5;
    ImageView image;
    Button tb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e3disp2);
        ttv1=(TextView)findViewById(R.id.ttv1);
        ttv2=(TextView)findViewById(R.id.ttv2);
        ttv3=(TextView)findViewById(R.id.ttv3);
        ttv4=(TextView)findViewById(R.id.ttv4);
        ttv5=(TextView)findViewById(R.id.ttv5);
        image=(ImageView)findViewById(R.id.imageView3);
        tb2=(Button) findViewById(R.id.tb2);
        //db1=(Button) findViewById(R.id.b1);
        final Intent i=new Intent(e3disp2.this,displayNext2.class);
        tb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}
