package com.example.newloginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;


public class sign_up_activity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        Button btnLogin = findViewById(R.id.btn_sign_up);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputEditText userNameEdit = findViewById(R.id.txt_edituser);
                TextInputEditText passwdEdit = findViewById(R.id.txt_editpass);
                String userStr = userNameEdit.getText().toString();
                String passwdStr = passwdEdit.getText().toString();

                if(userStr.matches("") || passwdStr.matches("")){
                    Toast.makeText(sign_up_activity.this, "username or password empty", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(sign_up_activity.this, welcome_activity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
