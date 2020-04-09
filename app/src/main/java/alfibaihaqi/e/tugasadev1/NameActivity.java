package alfibaihaqi.e.tugasadev1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class NameActivity extends AppCompatActivity {
   private Button btnSelanjutnya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        btnSelanjutnya = (Button) findViewById(R.id.btnlanjutName);

        btnSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setupFloatingLabelError();
                Intent intent = new Intent(NameActivity.this, DateActivity.class);
                startActivity(intent);




            }
        });
    }

    private void setupFloatingLabelError(){
        final TextInputLayout floatingName = (TextInputLayout)findViewById(R.id.nameTextInput);
        floatingName.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (floatingName.getEditText().length() < 0){
                    floatingName.setError(getString(R.string.error));
                    floatingName.setErrorEnabled(true);
                }else {
                    floatingName.setErrorEnabled(false);
                }
            }
        });
    }
}
