package com.trydagger22.Component;

import com.trydagger22.Module.VehicleModule;
import com.trydagger22.Vehicle;

import dagger.Component;

/**
 * Created by Roy.Leung on 21/3/17.
 */

@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();

}