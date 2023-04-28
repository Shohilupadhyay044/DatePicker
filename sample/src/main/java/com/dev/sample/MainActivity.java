package com.dev.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.dev.library.utils.DateUtils;
import com.dev.library.view.datePicker.DatePicker;
import com.dev.library.view.popup.DatePickerPopup;



public class MainActivity extends AppCompatActivity {
    private DatePickerPopup datePickerPopup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textDate = findViewById(R.id.text_date);

        datePickerPopup = new DatePickerPopup.Builder()
                .from(this)
                .offset(3)
                .darkModeEnabled(true)
                .pickerMode(DatePicker.MONTH_ON_FIRST)
                .textSize(19)
                .endDate(DateUtils.getTimeMiles(2050, 10, 25))
                .currentDate(DateUtils.getCurrentTime())
                .startDate(DateUtils.getTimeMiles(1995, 0, 1))
                .listener(new DatePickerPopup.OnDateSelectListener() {
                    @Override
                    public void onDateSelected(DatePicker dp, long date, int day, int month, int year) {
                        Toast.makeText(getApplicationContext(), "" + day + "/" + (month + 1) + "/" + year, Toast.LENGTH_SHORT).show();
                    }
                })
                .build();

        DatePicker datePicker = findViewById(R.id.datepicker);
        datePicker.setOffset(3);
        datePicker.setDarkModeEnabled(true);
        datePicker.setTextSize(19);
        datePicker.setMaxDate(DateUtils.getTimeMiles(2050, 10, 25));
        datePicker.setDate(DateUtils.getCurrentTime());
        datePicker.setMinDate(DateUtils.getTimeMiles(1995, 1, 12));
        datePicker.setPickerMode(DatePicker.DAY_ON_FIRST);


        datePicker.setDataSelectListener(new DatePicker.DataSelectListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onDateSelected(long date, int day, int month, int year) {
                textDate.setText("" + (month + 1) + "/" + year);
            }
        });

    }


    public void openDatePicker(View view) {
        datePickerPopup.show();
    }
}