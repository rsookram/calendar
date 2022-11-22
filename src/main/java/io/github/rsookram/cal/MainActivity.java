package io.github.rsookram.cal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;

import java.util.Calendar;

public class MainActivity extends Activity {

    public static final String KEY_DATE = "DATE";

    private long date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);

        CalendarView calendarView = findViewById(R.id.calendar);

        if (savedInstanceState != null) {
            date = savedInstanceState.getLong(KEY_DATE, System.currentTimeMillis());
            calendarView.setDate(date, false, false /* unused */);
        } else {
            date = calendarView.getDate();
        }

        calendarView.setOnDateChangeListener(
                (view, year, month, dayOfMonth) -> {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(year, month, dayOfMonth);

                    date = calendar.getTimeInMillis();
                }
        );
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong(KEY_DATE, date);
    }
}
