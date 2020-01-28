package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button theLoginButton;
    protected EditText theUsername;
    protected EditText thePassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing
        theLoginButton = findViewById(R.id.loginButton);
        theUsername = findViewById(R.id.userNameEditText);
        thePassword = findViewById(R.id.passwordEditText);


        theLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = theUsername.getText().toString().trim();

//                Toast.makeText(MainActivity.this, username, Toast.LENGTH_LONG).show();

                opentheLoginActivity(username);
            }
        });

    }

    public void opentheLoginActivity(String whoLoggedIn) {
        Intent transition = new Intent(this, LoggedInActivity.class);
        transition.putExtra("key", whoLoggedIn);
        startActivity(transition);


    }
}
