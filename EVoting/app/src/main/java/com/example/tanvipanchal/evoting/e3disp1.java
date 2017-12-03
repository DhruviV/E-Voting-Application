package com.example.tanvipanchal.evoting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class e3disp1 extends AppCompatActivity {
    TextView dtv1,dtv2,dtv3,dtv4,dtv5;
    ImageView image;
    Button db1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e3disp1);
        dtv1=(TextView)findViewById(R.id.dtv1);
        dtv2=(TextView)findViewById(R.id.dtv2);
        dtv3=(TextView)findViewById(R.id.dtv3);
        dtv4=(TextView)findViewById(R.id.dtv4);
        dtv5=(TextView)findViewById(R.id.dtv5);
        image=(ImageView)findViewById(R.id.image);
        db1=(Button) findViewById(R.id.db1);
        //db1=(Button) findViewById(R.id.b1);
        final Intent i=new Intent(e3disp1.this,displayNext2.class);
        db1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}

