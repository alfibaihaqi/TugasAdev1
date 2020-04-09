package alfibaihaqi.e.tugasadev1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenderActivity extends AppCompatActivity {
    private Button btnLanjutGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        btnLanjutGender = (Button) findViewById(R.id.btnLanjutGender);

        btnLanjutGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GenderActivity.this, PhoneActivity.class);
                startActivity(intent);
            }
        });
    }
}
