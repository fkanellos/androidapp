package com.example.newloginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class login_activity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }
    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputEditText userNameEdit = findViewById(R.id.txt_edituser);
                TextInputEditText passwdEdit = findViewById(R.id.txt_editpass);
                String userStr = userNameEdit.getText().toString();
                String passwdStr = passwdEdit.getText().toString();

                if(userStr.matches("") || passwdStr.matches("")){
                    Toast.makeText(login_activity.this, "username or password empty", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(login_activity.this, welcome_activity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
