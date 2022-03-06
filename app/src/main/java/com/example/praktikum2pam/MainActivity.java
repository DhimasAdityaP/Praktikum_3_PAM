package com.example.praktikum2pam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel untuk button
    Button btnLogin;

    //deklarasi variabel untuk EditText
    private EditText edemail, edpassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel edemail dengan component pada layout
        edemail = findViewById(R.id.edEmail);
        //menghubungkan variabel edpassword dengan component pada layout
        edpassword = findViewById(R.id.edPassword);
        //menghubungkan variabel btnLogin dengan component pada layout
        Button btnLogin = findViewById(R.id.btSignin);

        btnLogin.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();
                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                if (nama.equals("cindynurhabibah@gmail.com") && password.equals("12345")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "login berhasil", Toast.LENGTH_LONG);
                    t.show();
                } else if (nama.equals("cindynurhabibah@gmail.com")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "username anda salah", Toast.LENGTH_LONG);
                    t.show();
                } else if (password.equals("12345")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "password anda salah", Toast.LENGTH_LONG);
                    t.show();
                } else {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "username dan password anda salah", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}

