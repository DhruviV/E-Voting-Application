package com.example.tanvipanchal.evoting;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class login extends Activity {
    private Button bLogin;
    private EditText etUser, etPass;
    String uname,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUser = (EditText) findViewById(R.id.etUsername);
        etPass = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        uname = etUser.getText().toString();
        SharedPreferences sp = getSharedPreferences("PREFS",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putString("u",uname);
        ed.apply();
        pwd = etPass.getText().toString().trim().toLowerCase();
        final Connector c = new Connector(this);
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String type = "login";
                c.execute(type,uname,pwd);
            }
        });
    }
}