package viet.oop.seday04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    private EditText InputPhoneNumber, InputPassword;
    private Button LoginButton;
    private TextView loginGiaovukhoa, loginGiangVien, loginSinhVien;
    private String parentDbName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton = (Button) findViewById(R.id.login_btn);

        loginGiaovukhoa = (TextView) findViewById(R.id.logingiaovukhoabtn);
        loginGiangVien = (TextView) findViewById(R.id.logingiangvienbtn);
        loginSinhVien = (TextView) findViewById(R.id.loginsinhvienbtn);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
              if ( parentDbName.equals("SinhVien")) {
                  Intent intent = new Intent(loginActivity.this, XemTKBSV.class);
                  startActivity(intent);
              }
              if( parentDbName.equals("GiangVien")) {
                  Intent intent = new Intent(loginActivity.this, XemTKBGV.class);
                  startActivity(intent);
              }
              if (parentDbName.equals("GiaoVuKhoa")){
                  Intent intent = new Intent(loginActivity.this, HomeActivity.class);
                  startActivity(intent);
              }
            }
        });

        loginGiaovukhoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginButton.setText("Login as GiaoVuKhoa");
                parentDbName = "GiaoVuKhoa";

            }
        });

        loginGiangVien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginButton.setText("Login as GiangVien");
                parentDbName = "GiangVien";
            }
        });

        loginSinhVien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginButton.setText("Login as SinhVien");
                parentDbName = "SinhVien";
            }
        });


    }


    }


