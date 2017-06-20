package de.tum.in.www1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import de.tum.in.www1.model.Reservation;

public class PedelecActivity extends AppCompatActivity {

    TextView pedelecName;
    DatePicker datePicker;
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedelec);
        pedelecName = (TextView)findViewById(R.id.pedelecName);
        datePicker = (DatePicker)findViewById(R.id.datePicker);
        timePicker = (TimePicker)findViewById(R.id.timePicker);
    }

    public void onReserveTapped(View button) {
        Log.d("PedelecApp","Reserve tapped");
        Reservation reservation = new Reservation();
        reservation.setBike((String)pedelecName.getText());
        reservation.setStartTime(timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute());
        reservation.setStartDate(datePicker.getDayOfMonth() + "." + datePicker.getMonth() + "." + datePicker.getYear());
        reservation.save();
    }
}
