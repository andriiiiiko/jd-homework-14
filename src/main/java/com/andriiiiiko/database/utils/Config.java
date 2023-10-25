package com.andriiiiiko.database.utils;

/**
 * This class holds configuration settings for connecting to a MySQL database.
 */
public class Config {

    /**
     * The JDBC URL for the database connection.
     */
    public static final String JDBC_URL = "jdbc:mysql://52.59.26.171" +
            ":3306/jd-homework-13";

    /**
     * The username for the database connection.
     */
    public static final String USERNAME = "root";

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
