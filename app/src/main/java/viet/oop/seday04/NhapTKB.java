package viet.oop.seday04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NhapTKB extends AppCompatActivity {


    private Button DangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_tkb);

        DangNhap = (Button) findViewById(R.id.DangNhap);
        DangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NhapTKB.this, DangNhapActivity.class);
                startActivity(intent);

            }
        });

    }
}