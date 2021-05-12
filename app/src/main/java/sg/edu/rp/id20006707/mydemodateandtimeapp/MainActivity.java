package sg.edu.rp.id20006707.mydemodateandtimeapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;

    Button btnDisplayDate, btnDisplayTime, btnDisplayReset;
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplayReset = findViewById(R.id.buttonDisplayReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String timeis = "Time is " + tp.getCurrentHour() + ":" +
                        String.format("%02d", tp.getCurrentMinute());
                tvDisplay.setText(timeis);


            }

        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dateis = "Date is " + dp.getDayOfMonth() + "/" + dp.getMonth() + "/" + (dp.getMonth()+1) + dp.getYear();
                tvDisplay.setText(dateis);

            }
        });

        btnDisplayReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setCurrentHour(0);
                tp.setCurrentHour(0);
                dp.updateDate(2020, 01, 1);

            }
        });

    }
}


