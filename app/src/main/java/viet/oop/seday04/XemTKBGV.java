package viet.oop.seday04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class XemTKBGV extends AppCompatActivity {
    private Button xemTKB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xem_tkbgv2);

        xemTKB = (Button) findViewById(R.id.xemTKB);
        xemTKB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XemTKBGV.this, XemTKB.class);
                startActivity(intent);

            }
        });
    }
}