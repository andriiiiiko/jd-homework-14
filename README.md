# SpaceTravel Project

This project involves extending an existing [codebase](https://github.com/andriiiiiko/jd-homework-13) with the following
tasks:

## Task 1 - Add Ticket Entity

Create a new entity named "Ticket" and define the Hibernate mappings to work with this entity. Pay attention to the one-to-many relationships, for instance, one client can have multiple tickets. Therefore, the "Ticket" entity should have a field of type "Client" with proper mappings. The same applies to the initial and final planets.

## Task 2 - Implement CRUD Service for Tickets

Write a CRUD service for managing tickets. Ensure that your code handles the following situations correctly:

- It should not be possible to save a ticket for a non-existent or null client.
- It should not be possible to save a ticket for a non-existent or null planet.

Make sure to thoroughly test your code to ensure it functions correctly.

## Task 3 - Upload the Code to GitHub

Upload your code to a GitHub repository. Ensure that the .gitignore file is properly configured so that only necessary files are included in the repository.

## Submission

Please provide a link to your GitHub repository where the completed tasks have been implemented.