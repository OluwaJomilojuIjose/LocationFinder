package com.example.locationfinder;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class                                                                                MainActivity extends AppCompatActivity {
    private DatabaseHelper dbHelper;
    private EditText editTextAddress, editTextLatitude, editTextLongitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DatabaseHelper(this);

        editTextAddress = findViewById(R.id.editTextAddress);
        editTextLatitude = findViewById(R.id.editTextLatitude);
        editTextLongitude = findViewById(R.id.editTextLongitude);

        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonDelete = findViewById(R.id.buttonDelete);
        Button buttonUpdate = findViewById(R.id.buttonUpdate);
        Button buttonQuery = findViewById(R.id.buttonQuery);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addLocation();
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteLocation();
            }
        });

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateLocation();
            }
        });

        buttonQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                queryLocation();
            }
        });
    }

    private void addLocation() {
        String address = editTextAddress.getText().toString();
        double latitude = Double.parseDouble(editTextLatitude.getText().toString());
        double longitude = Double.parseDouble(editTextLongitude.getText().toString());

        boolean inserted = dbHelper.addLocation(address, latitude, longitude);
        showToast(inserted ? "Location added successfully" : "Failed to add location");
    }

    private void deleteLocation() {
        String address = editTextAddress.getText().toString();
        boolean deleted = dbHelper.deleteLocation(address);
        showToast(deleted ? "Location deleted" : "Location not found");
    }

    private void updateLocation() {
        String address = editTextAddress.getText().toString();
        double latitude = Double.parseDouble(editTextLatitude.getText().toString());
        double longitude = Double.parseDouble(editTextLongitude.getText().toString());

        boolean updated = dbHelper.updateLocation(address, latitude, longitude);
        showToast(updated ? "Location updated" : "Failed to update location");
    }

    private void queryLocation() {
        String address = editTextAddress.getText().toString();
        Cursor cursor = dbHelper.getLocationByAddress(address);

        if (cursor.moveToFirst()) {
            editTextLatitude.setText(String.valueOf(cursor.getDouble(cursor.getColumnIndex("latitude"))));
            editTextLongitude.setText(String.valueOf(cursor.getDouble(cursor.getColumnIndex("longitude"))));
            showToast("Location found");
        } else {
            showToast("Location not found");
        }
        cursor.close();
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
