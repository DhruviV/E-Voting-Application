package com.example.tanvipanchal.evoting;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class Register extends Activity{
    private Button bRegister;
    private EditText etName, etAge, etEnrollment, etContact, etEmail, etUsername, etPassword,gender;
    private static final String REGISTER_URL = "http://localhost/Php/register.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        bRegister = (Button) findViewById(R.id.bRegister);
        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etEnrollment = (EditText) findViewById(R.id.etEnrollment);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etContact = (EditText) findViewById(R.id.etContact);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        gender = (EditText) findViewById(R.id.etgender);
        final ConnectorR c = new ConnectorR(this);
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gen = gender.getText().toString();
                String name = etName.getText().toString().trim().toLowerCase();
                String enrollment = etEnrollment.getText().toString().trim().toLowerCase();
                String age = etAge.getText().toString().trim().toLowerCase();
                String contact = etContact.getText().toString().trim().toLowerCase();
                String email = etEmail.getText().toString().trim().toLowerCase();
                String username = etUsername.getText().toString().trim().toLowerCase();
                String password = etPassword.getText().toString().trim().toLowerCase();
                String type = "register";
                c.execute(type,name,enrollment,age,gen,contact,email,username,password);
            }
        });
    }
}