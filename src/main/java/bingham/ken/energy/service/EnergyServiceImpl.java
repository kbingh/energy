package bingham.ken.energy.service;

import org.springframework.stereotype.Service;

@Service
public class EnergyServiceImpl implements EnergyService {

    public final static double LIGHTSPEED = 299792458.00;

    /**
     * formula E = MC^2
     * @param mass
     * @return
     */
    @Override
    public double calculateEnergy(Double mass) {

        return ( LIGHTSPEED * LIGHTSPEED ) * mass;
    }

    /**
     * formula M = E/C^2
     * @param energy
     * @return
     */
    @Override
    public double calculateMass(Double energy) {
        return energy / ( LIGHTSPEED * LIGHTSPEED );
    }
}
