# SpaceTravel Project

## Project Description
You are working at SpaceTravel, a company that specializes in transporting passengers between planets. The project
involves the following entities and their relationships:

### Client
- A client of the company with the following properties:
    - `id` - Identifier, primary surrogate key, auto-incrementing number.
    - `name` - Name, 3 to 200 characters long.

### Planet
- Represents the initial or final departure point and has the following properties:
    - `id` - Planet identifier. A string consisting exclusively of uppercase Latin letters and numbers, e.g., MARS,
      VENUS.
    - `name` - Planet name, a string from 1 to 500 characters long.

### Ticket
- A ticket with the following properties:
    - `id` - Ticket identifier, primary surrogate key, auto-incrementing number.
    - `created_at` - TIMESTAMP in UTC when this ticket was created.
    - `client_id` - Identifier of the client to whom this ticket belongs.
    - `from_planet_id` - Identifier of the planet from which the passenger departs.
    - `to_planet_id` - Identifier of the planet to which the passenger is traveling.

## Task #1 - Set Up the Project with Hibernate
1. Create a new Gradle project.
2. Connect the following libraries:
    - MySQL
    - Hibernate
    - Flyway
3. Ensure that your project runs without errors.

## Task #2 - Write Migrations to Create and Populate the Database
1. Write two migrations:
    - The first migration (named V1__create_db.sql) should create the database structure, including all tables and
      relationships. Ensure proper constraints.

    - The second migration (named V2__populate_db.sql) should populate the database with data, including at least:
        - 10 clients
        - 5 planets
        - 10 tickets
2. Ensure that the program runs, and both migrations execute correctly.

## Task #3 - Create CRUD Services for Client and Planet
1. Describe the Client and Planet entities and set up Hibernate mappings for these entities (client and planet tables
   in the database).
2. Write CRUD services for both entities: `ClientCrudService` and `PlanetCrudService`.
3. Write test code that adds and removes records using these services. Ensure that all CRUD operations work correctly.

## Task #4 - Upload Code to GitHub
Upload the code to a GitHub repository. Make sure that the `.gitignore` file is configured correctly, and only the
necessary files are included in the repository.