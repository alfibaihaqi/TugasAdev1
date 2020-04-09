package alfibaihaqi.e.tugasadev1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.Calendar;

public class DateActivity extends AppCompatActivity {
    private static final String TAG = "DateActivity";
    private TextView tvdate;
    private DatePickerDialog.OnDateSetListener mDateListener;
    private Button btnLanjutDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        tvdate = (TextView) findViewById(R.id.date);
        btnLanjutDate = (Button) findViewById(R.id.btnLanjutDate);

        Calendar cal = Calendar.getInstance();
        final int year = cal.get(Calendar.YEAR);
        final int month = cal.get(Calendar.MONTH);
        final int day = cal.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog = new DatePickerDialog(DateActivity.this,
                android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                mDateListener, year,month,day);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

        btnLanjutDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DateActivity.this, GenderActivity.class);
                startActivity(intent);

            }
        });
        mDateListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG,"onDateset: mm/dd/yyy: " + month + "/" + day + "/" + year);

                String date = month + "/" + day + "/" + year;
                tvdate.setText(date);
            }
        };

    }
}
