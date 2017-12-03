package com.example.tanvipanchal.evoting;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class displayNext extends Activity {
    int uid,i1;
    RadioGroup rg;
    RadioButton rb;
    Button b1;
    String uname,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_next);
        rg = (RadioGroup) findViewById(R.id.radioGroup1);
        b1=(Button)findViewById(R.id.bu);
        uname = "tanvip";
        final Count c1= new Count(getApplicationContext());
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(id);
                s = rb.getText().toString();
                if (s.equals("Candidate1")) {
                    i1 = 1;
                }
                else if (s.equals("Candidate2")) {
                    i1 = 2;
                } else {
                    i1 = 3;
                }
                Toast.makeText(displayNext.this,"Voted to"+rb.getText().toString(),Toast.LENGTH_LONG).show();
                c1.execute(uname,String.valueOf(i1));
            }
        });
    }
}
