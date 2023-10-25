package com.andriiiiiko;

import com.andriiiiiko.database.repositories.ClientCrud;
import com.andriiiiiko.database.repositories.PlanetCrud;
import com.andriiiiiko.database.entities.Client;
import com.andriiiiiko.database.entities.Planet;
import com.andriiiiiko.database.utils.FlywayMigration;
import com.andriiiiiko.database.utils.HibernateUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger LOG = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("The program has started");

        FlywayMigration.migrateDatabase();

        ClientCrud clientCrud = new ClientCrud();

        Client newClient = new Client();
        newClient.setFirstName("Andrii");
        newClient.setLastName("Protas");
        clientCrud.persist(newClient);

        Client client = clientCrud.getById(2L);

        client.setFirstName("Jane");
        client.setLastName("Doe");
        clientCrud.merge(client);

        clientCrud.remove(client);



        PlanetCrud planetCrud = new PlanetCrud();

        Planet newPlanet = new Planet();
        newPlanet.setId("NEP");
        newPlanet.setName("Neptune");
        planetCrud.persist(newPlanet);

        Planet planet = planetCrud.getById("SAT");

        planet.setId("EAR");
        planet.setName("Earth");
        planetCrud.merge(planet);

        planetCrud.remove(planet);

        HibernateUtil.getInstance().close();

        LOG.info("The program has finished");
    }
}
