package bingham.ken.energy;

import bingham.ken.energy.service.EnergyService;
import bingham.ken.energy.service.EnergyServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hibernate.validator.internal.util.Contracts.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnergyApplicationTests {

	@Test
	public void contextLoads() {
	}

	/**
	 *  Test calculateEnergy function when passing in 10 kg of mass
	 */
	@Test
	public void testCalculateEnergyEnergy(){

		EnergyService energyService = new EnergyServiceImpl();

		double energy = energyService.calculateEnergy(10.00);

		assertTrue(energy == 8.9875517873681766E17, "10 kg of mass did not produce 8.9875517873681766E17 joules of energy");
	}

	/**
	 *  Test calculateMass function when passing in 10000 joules of energy
	 */
	@Test
	public void testCalculateMass(){

		EnergyService energyService = new EnergyServiceImpl();

		double mass = energyService.calculateMass(10000.00);

		assertTrue(mass == 1.1126500560536185E-13, "10000 joules of energy did not produce 1.1126500560536185E-13 kg of mass");
	}
}
