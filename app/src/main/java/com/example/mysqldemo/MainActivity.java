package com.example.mysqldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText UsernameET, PasswordET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameET = (EditText)findViewById(R.id.etusername);
        PasswordET = (EditText)findViewById(R.id.etpassword);
    }
    public void onLogin(View view){
        String username = UsernameET.getText().toString();
        String password = PasswordET.getText().toString();
        String type = "Login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(username,password,type);
    }
}
