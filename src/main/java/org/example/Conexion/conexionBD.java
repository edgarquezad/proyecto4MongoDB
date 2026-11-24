package org.example.Conexion;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class conexionBD {

    private static conexionBD instancia;

    private MongoClient mongo;
    private MongoDatabase db;

    private conexionBD() {
        mongo = MongoClients.create("mongodb://localhost:27017");
        db = mongo.getDatabase("BDGestionRefugio");
    }

    public static conexionBD getInstance() {
        if (instancia == null) {
            instancia = new conexionBD();
        }
        return instancia;
    }

    public MongoDatabase getDb() {
        return db;
    }

    public MongoClient getMongo() {
        return mongo;
    }
}
