/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.flyway;

import org.flywaydb.core.Flyway;

public final class FlywayMigration {

    private static String H2_DB_URL = "jdbc:h2:file:./target/foobar";
    private static String H2_USERNAME = "SA";
    private static String H2_PASSWORD = null;

    private FlywayMigration() {
    }

    /**
     * mvn package exec:java -Dexec.mainClass=com.mycompany.flyway.FlywayMigration
     *
     * @param args
     */
    public static void main(String[] args) {

        // Creating the Flyway instance
        Flyway flyway = new Flyway();

        // pointing it to the database
        flyway.setDataSource(H2_DB_URL, H2_USERNAME, H2_PASSWORD);

        // migration
        flyway.migrate();
    }
}
