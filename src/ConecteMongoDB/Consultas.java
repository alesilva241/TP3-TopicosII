/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConecteMongoDB;

import OOClasses.Hero;
import UI.ListSearch;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author alexandra
 */
public class Consultas {
    
    public ArrayList<Hero> buscaGeral(String termo){
        ArrayList<Hero> resultados = new ArrayList<>();
               
        return resultados;
    }
    
    public ArrayList<Hero> buscaHero(String hero) {
        ArrayList<Hero> resultados = new ArrayList<>();
        
        DBCollection colecao = MongoConnection.getInstance().getDB().getCollection("heroesdata");
        BasicDBObject query = new BasicDBObject("Title", hero);
        DBCursor cursor;

        cursor = colecao.find(query);
        try {
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String nome = (String)obj.get("Title");
                String lore = (String)obj.get("Lore");
                String sider = (String)obj.get("Side");
                String url = (String)obj.get("Url");
                Hero novoHero = new Hero(nome, lore, sider, url);
                resultados.add(novoHero);
            }
        } finally {
            cursor.close();
        }
        
        return resultados;
    }
    
    public ArrayList<Hero> buscaSide(String side) {
        ArrayList<Hero> resultados = new ArrayList<>();
        DBCollection colecao = MongoConnection.getInstance().getDB().getCollection("heroesdata");
        BasicDBObject query = new BasicDBObject("Side", side);
        DBCursor cursor;
                
        cursor = colecao.find(query).sort(new BasicDBObject("Initial"+"."+"Strength", -1));
        
        try {
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String nome = (String)obj.get("Title");
                String lore = (String)obj.get("Lore");
                String sider = (String)obj.get("Side");
                String url = (String)obj.get("Url");
                Hero novoHero = new Hero(nome, lore, sider, url);
                resultados.add(novoHero);
            }
        } finally {
            cursor.close();
        }
        //System.out.println(colecao.count(query));
        //System.out.println(resultados.size());
        
        return resultados;
    }
    
    public ArrayList<Hero> buscaFunction(String function){
        ArrayList<Hero> resultados = new ArrayList<>();
        DBCollection colecao = MongoConnection.getInstance().getDB().getCollection("heroesdata");
        
        DBCursor cursor;
        
        BasicDBObject query = new BasicDBObject("SuggestedRoleLevels"+"."+function, new BasicDBObject("$gt", 1));
        
        cursor = colecao.find(query).sort(new BasicDBObject("SuggestedRoleLevels"+"."+function, -1));
        
        try {
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String nome = (String)obj.get("Title");
                String lore = (String)obj.get("Lore");
                String sider = (String)obj.get("Side");
                String url = (String)obj.get("Url");
                Hero novoHero = new Hero(nome, lore, sider, url);
                resultados.add(novoHero);
            }
        } finally {
            cursor.close();
        }
        return resultados;
    }
    
    public ArrayList<Hero> buscaSkill(String skill){
        ArrayList<Hero> resultados = new ArrayList<>();
        
        DBCollection colecao = MongoConnection.getInstance().getDB().getCollection("heroesdata");
        
        DBCursor cursor;
        
        BasicDBObject query = new BasicDBObject("Abilities"+"."+skill, new BasicDBObject("$gt", 1));
        
        cursor = colecao.find(query).sort(new BasicDBObject("Abilities"+"."+"Title", -1));
        
        try {
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String nome = (String)obj.get("Title");
                String lore = (String)obj.get("Lore");
                String sider = (String)obj.get("Side");
                String url = (String)obj.get("Url");
                Hero novoHero = new Hero(nome, lore, sider, url);
                resultados.add(novoHero);
            }
        } finally {
            cursor.close();
        }
        
        
        return resultados;
    }
}
