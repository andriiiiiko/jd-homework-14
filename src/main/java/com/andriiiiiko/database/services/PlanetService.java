package com.andriiiiiko.database.services;

import com.andriiiiiko.database.dao.PlanetDao;
import com.andriiiiiko.database.entities.Planet;

public class PlanetService {

    private PlanetDao planetDao = new PlanetDao();

    public void savePlanet(Planet planet) {
        planetDao.save(planet);
    }

    public Planet findClientById(Long id) {
        return planetDao.findById(id);
    }

    public void updatePlanet(Planet planet) {
        planetDao.update(planet);
    }

    public void deletePerson(Planet planet) {
        planetDao.delete(planet);
    }
}
