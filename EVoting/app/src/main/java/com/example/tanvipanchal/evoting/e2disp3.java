package com.example.tanvipanchal.evoting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class e2disp3 extends Activity {
    TextView atv1,atv2,atv3,atv4,atv5;
    ImageView image;
    Button ab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e2disp3);
        atv1=(TextView)findViewById(R.id.atv1);
        atv2=(TextView)findViewById(R.id.atv2);
        atv3=(TextView)findViewById(R.id.atv3);
        atv4=(TextView)findViewById(R.id.atv4);
        atv5=(TextView)findViewById(R.id.atv5);
        image=(ImageView)findViewById(R.id.image);
        ab3=(Button) findViewById(R.id.ab3);

        final Intent i=new Intent(e2disp3.this,displayNext1.class);
        ab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}
