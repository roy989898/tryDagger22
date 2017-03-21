package com.trydagger22.Module;

import com.trydagger22.Motor;
import com.trydagger22.Vehicle;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Roy.Leung on 21/3/17.
 */

@Module
public class VehicleModule {

    @Provides
    Motor provideMotor() {
        return new Motor();
    }

    @Provides
    Vehicle provideVehicle(Motor m) {
        return new Vehicle(m);
    }
}
