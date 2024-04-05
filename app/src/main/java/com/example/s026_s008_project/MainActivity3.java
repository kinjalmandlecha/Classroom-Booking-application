package com.example.s026_s008_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private DatePicker datePicker;
    private TimePicker timePicker;
    private Button cr101Button, cr102Button, cr103Button, cl101Button, cl102Button, cl103Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        cr101Button = findViewById(R.id.button);
        cr102Button = findViewById(R.id.button2);
        cr103Button = findViewById(R.id.button3);
        cl101Button = findViewById(R.id.button4);
        cl102Button = findViewById(R.id.button5);
        cl103Button = findViewById(R.id.button6);


        cr101Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleBooking("CR101");
            }
        });


        cr102Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                handleBooking("CR102");
            }
        });


        cr103Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleBooking("CR103");
            }
        });


        cl101Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                handleBooking("CL101");
            }
        });


        cl102Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                handleBooking("CL102");
            }
        });


        cl103Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                handleBooking("CL103");
            }
        });
    }

    private void handleBooking(String classroom) {

        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth() + 1;
        int year = datePicker.getYear();


        int hour = timePicker.getHour();
        int minute = timePicker.getMinute();


        String bookingDetails = "Classroom: " + classroom + "\nDate: " + day + "/" + month + "/" + year + "\nTime: " + hour + ":" + minute;
        Toast.makeText(MainActivity3.this, "Booking Details:\n" + bookingDetails, Toast.LENGTH_LONG).show();
    }
}