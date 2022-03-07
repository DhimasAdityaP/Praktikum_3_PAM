package com.example.praktikum2pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

                String email = "cindynurhabibah@gmail.com";

                String pass = "12345";

                //mengecek apakah edittext email dan password terdapat isi atau tidak
                if (nama.equals("cindynurhabibah@gmail.com") && password.equals("12345")) {
                    //membuat variabel toast dan menampilkan pesa "edittext tidak boleh kosong"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "login berhasil", Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                    Bundle n = new Bundle();

                    //membuat objek bundle
                    Bundle b = new Bundle();
                    //memasukkan value dari variabel nama dengan kunci "a"
                    //dan dimasukkan kedalam bundle
                    b.putString("a", nama.trim());
                    //memasukkan value dari variabel nama dengan kunci "a"
                    //dan dimasukkan kedalam bundle
                    b.putString("b", password.trim());
                    //membuat objek intent berpindah activity dari mainactivity ke activityhasil
                    Intent i = new Intent(getApplicationContext(), ActivityHasil.class);
                    //memasukkan bundle kedalam intent untuk dikirimkan ke activityhasil
                    i.putExtras(b);
                    //berpindah ke activityhasil
                    startActivity(i);

                } else if (nama.equals("cindynurhabibah@gmail.com")) {
                    //mengecek apakah isi dari email dan password sudah sama dengan email dan
                    //password yang sudah diset
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