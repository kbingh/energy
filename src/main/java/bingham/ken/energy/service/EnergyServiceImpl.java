package bingham.ken.energy.service;

import org.springframework.stereotype.Service;

@Service
public class EnergyServiceImpl implements EnergyService {

    public final static double LIGHTSPEED = 299792458.00;


    @Override
    public double calculateEnergy(Double mass) {

        return ( LIGHTSPEED * LIGHTSPEED ) * mass;
    }

    @Override
    public double calculateMass(Double energy) {
        return energy / ( LIGHTSPEED * LIGHTSPEED );
    }
}
