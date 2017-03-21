package com.trydagger22.Factory;

import com.trydagger22.Motor;
import com.trydagger22.Vehicle;

/**
 * Created by Roy.Leung on 21/3/17.
 */

public class MyFactory {
    public static Motor createMotor() {
        return new Motor();

    }

    public static Vehicle createVehicle(Motor motor) {
        return new Vehicle(motor);
    }
}
