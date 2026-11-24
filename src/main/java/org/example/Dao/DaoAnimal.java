package org.example.Dao;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.example.Conexion.conexionBD;
import org.example.IDao.IDaoAnimal;
import org.example.Modelos.Animal;

import java.util.ArrayList;
import java.util.List;

public class DaoAnimal implements IDaoAnimal {
  private MongoCollection<Document> collectionAnimal;

  public DaoAnimal() {
      collectionAnimal=conexionBD.getInstance()
              .getDb()
              .getCollection("Animales");
  }



    @Override
    public int add(Animal animal) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public Animal getAnimal(int id) {
        return null;
    }

    @Override
    public List<Animal> getAnimales() {
        return List.of();
    }

    @Override
    public int update(Animal animal) {
        return 0;
    }
}
