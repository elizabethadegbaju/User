package com.example.user;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText phoneNumberEditText;
    private TextView usernameTextView;
    private TextView emailTextView;
    private TextView passwordTextView;
    private TextView phoneNumberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.UsernameEditText);
        emailEditText = findViewById(R.id.EmailEditText);
        passwordEditText = findViewById(R.id.PasswordEditText);
        phoneNumberEditText = findViewById(R.id.PhoneNumberEditText);

        usernameTextView = findViewById(R.id.UsernameTextView);
        emailTextView = findViewById(R.id.EmailTextView);
        passwordTextView = findViewById(R.id.PasswordTextView);
        phoneNumberTextView = findViewById(R.id.PhoneNumberTextView);


    }

    public void onButtonClick(View view) {

        Toast.makeText(MainActivity.this, usernameEditText.getText().toString(), Toast.LENGTH_SHORT).show();

        usernameTextView.setText(usernameEditText.getText().toString());
        emailTextView.setText(emailEditText.getText().toString());
        passwordTextView.setText(passwordEditText.getText().toString());
        phoneNumberTextView.setText(phoneNumberEditText.getText().toString());


    }
}

