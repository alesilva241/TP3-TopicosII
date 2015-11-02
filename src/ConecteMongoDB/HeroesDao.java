/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConecteMongoDB;

import OOClasses.Hero;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexandra
 */
public class HeroesDao implements  IHeroDao<Hero>{
    
    
    private DBCollection db;

    public HeroesDao() {
        this.db = MongoConnection.getInstance().getDB().getCollection("heroesdata");
    }

    @Override
    public List<Hero> findHeroes(DBObject dbo) {
        List<Hero> contatos = new ArrayList<>();

        DBCursor cursor = db.find(dbo);

        while (cursor.hasNext()) {
            contatos.add(HeroConverter.converterToContato(cursor.next()));
        }

        return contatos;
    }
    
}
