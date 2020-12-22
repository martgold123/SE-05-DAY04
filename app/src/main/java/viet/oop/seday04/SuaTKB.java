package viet.oop.seday04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuaTKB extends AppCompatActivity {

    private Button DangNhap;
    private Button ChonTKB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sua_tkb);

        DangNhap = (Button) findViewById(R.id.DangNhap);
        DangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuaTKB.this, DangNhapActivity.class);
                startActivity(intent);

            }
        });

        ChonTKB = (Button) findViewById(R.id.ChonTKB);
        ChonTKB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuaTKB.this, ChonTKB.class);
                startActivity(intent);

            }
        });
    }
}