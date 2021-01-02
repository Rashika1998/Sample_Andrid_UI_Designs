package com.android.app.simple_adroid_login_signup_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    private Button login_navigate_btn;
    private Button signup_navigate_btn;
    private Button profile_navigate_btn;
    private Button profile_edit_navigate_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_navigate_btn = (Button) findViewById(R.id.login_btn);
        signup_navigate_btn = (Button) findViewById(R.id.signup_btn);
        profile_navigate_btn = (Button) findViewById(R.id.profile_btn);
        profile_edit_navigate_btn = (Button) findViewById(R.id.profile_edit_btn);



        login_navigate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent loginIntent = new Intent(MainActivity.this , SignInActivity.class);
                startActivity(loginIntent);
            }
        });


        signup_navigate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent signupIntent = new Intent(MainActivity.this , SignUpActivity.class);
                startActivity(signupIntent);
            }
        });


        profile_navigate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent signupIntent = new Intent(MainActivity.this , ProfileActivity.class);
                startActivity(signupIntent);
            }
        });


        profile_edit_navigate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent editPProfileIntent = new Intent(MainActivity.this , EditProfileActivity.class);
                startActivity(editPProfileIntent);
            }
        });






    }

}
