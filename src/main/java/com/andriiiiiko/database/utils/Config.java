package com.andriiiiiko.database.utils;

/**
 * This class holds configuration settings for connecting to a MySQL database.
 */
public class Config {

    /**
     * The JDBC URL for the database connection.
     */
    public static final String JDBC_URL = "jdbc:mysql://database-goit.c082abjve5fs.eu-central-1.rds.amazonaws.com:" +
            "3306/jd-homework-14";

    /**
     * The username for the database connection.
     */
    public static final String USERNAME = "admin";

    /**
     * The password for the database connection.
     */
    public static final String PASSWORD = "password";

    /**
     * Default constructor. Private to prevent instantiation of this utility class.
     */
    private Config() {
    }
}
