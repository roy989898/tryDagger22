package com.trydagger22;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.trydagger22.Component.DaggerVehicleComponent;
import com.trydagger22.Component.VehicleComponent;
import com.trydagger22.Module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    private VehicleComponent component;
    private TextView tvShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvShow = (TextView) findViewById(R.id.tv_show);

        component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        Vehicle vehicle = component.provideVehicle();
        vehicle.getSpeed();

        tvShow.setText(vehicle.getSpeed() + "");
    }
}
