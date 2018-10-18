package bingham.ken.energy.controller;

import bingham.ken.energy.service.EnergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnergyController {

    @Autowired
    EnergyService energyService;

    @GetMapping(value="/mass/{mass}")
    @ResponseBody
    public Double getEnergy(@PathVariable("mass") Double mass) {

        return energyService.calculateEnergy( mass );
    }

    @GetMapping(value="/energy/{energy}")
    @ResponseBody
    public Double getMass(@PathVariable("energy") Double energy) {

        return energyService.calculateEnergy( energy );
    }
}
