package id.yusufrizalh.myqrscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // (1) tuliskan semua komponen dalam layout
    private Button btn_open_camera;
    public static TextView txt_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // (2) kenali semua komponen dalam layout
        btn_open_camera = findViewById(R.id.btn_open_camera);
        txt_display = findViewById(R.id.txt_display);

        // (3) event handling
        btn_open_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
