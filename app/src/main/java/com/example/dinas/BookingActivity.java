package com.example.dinas;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.snackbar.Snackbar;
import com.jaredrummler.materialspinner.MaterialSpinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class BookingActivity extends AppCompatActivity {
    private EditText et_ttl;
    private Calendar calendar;
    private static final String[] LAYANAN = {
           "KK",
            "KTP",
            "KIA",
            "AKTE"
    };
    private static final String[] WAKTU = {
            "09-10",
            "10-11",
            "11-12",

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        et_ttl = findViewById(R.id.et_ttl);
        calendar = Calendar.getInstance();
        et_ttl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDate();
            }
        });
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//
//            @Override public void onClick(View view) {
//                try {
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/jaredrummler/MaterialSpinner")));
//                } catch (ActivityNotFoundException ignored) {
//                }
//            }
//        });

        MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.layanan);
        spinner.setItems(LAYANAN);
        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
        spinner.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {

            @Override public void onNothingSelected(MaterialSpinner spinner) {
                Snackbar.make(spinner, "Nothing selected", Snackbar.LENGTH_LONG).show();
            }
        });
        MaterialSpinner spinner1 = (MaterialSpinner) findViewById(R.id.waktu);
        spinner1.setItems(WAKTU);
        spinner1.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
        spinner1.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {

            @Override public void onNothingSelected(MaterialSpinner spinner) {
                Snackbar.make(spinner, "Nothing selected", Snackbar.LENGTH_LONG).show();
            }
        });

    }

    private void getDate() {
        new DatePickerDialog(BookingActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                et_ttl.setText(new SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.US).format(calendar.getTime()));
            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();

    }
}