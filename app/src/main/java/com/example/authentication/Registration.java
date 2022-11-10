package com.example.authentication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity {
    private FirebaseAuth mAuth;
    Button reg;
    TextView login;
    EditText email1,password1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        reg = findViewById(R.id.register);
        login = findViewById(R.id.signin);
        email1 = findViewById(R.id.email);
        password1 = findViewById(R.id.password);
        mAuth = FirebaseAuth.getInstance();

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PerforAuth();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registration.this,Login.class));
            }
        });
    }

    public void PerforAuth() {
        String email = email1.getText().toString();
        String pass = password1.getText().toString();

        if(email.isEmpty()){
            email1.setError("Email can not be empty");
        }
        if(pass.isEmpty()){
            password1.setError("Password can not be empty");
        }
        else{
            mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(Registration.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Registration.this,MainActivity.class));
                    }
                    else{
                        Toast.makeText(Registration.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
        }

    }
