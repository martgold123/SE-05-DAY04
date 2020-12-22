package viet.oop.seday04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button XemTKB, NhapTKB, SuaTKB, XoaTKB, DangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        XemTKB = (Button) findViewById(R.id.xemTKB);
        XemTKB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, XemTKB.class);
                startActivity(intent);

            }
        });


        NhapTKB = (Button) findViewById(R.id.NhapTKB);
        NhapTKB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, NhapTKB.class);
                startActivity(intent);

            }
        });

        SuaTKB = (Button) findViewById(R.id.SuaTKB);
        SuaTKB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SuaTKB.class);
                startActivity(intent);

            }
        });

        XoaTKB = (Button) findViewById(R.id.XoaTKB);
        XoaTKB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, XOATKB.class);
                startActivity(intent);

            }
        });

        DangNhap = (Button) findViewById(R.id.DangNhap);
        DangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DangNhapActivity.class);
                startActivity(intent);

            }
        });




    }
}