package alfibaihaqi.e.tugasadev1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class PasswordActivity extends AppCompatActivity {
    private Button btnLanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        btnLanjut = (Button) findViewById(R.id.btnLanjutPaswword);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PasswordActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
