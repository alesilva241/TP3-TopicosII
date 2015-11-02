/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConecteMongoDB;

import com.mongodb.DBObject;
import java.util.List;
import java.io.Serializable;

/**
 *
 * @author alexandra
 */
public interface IHeroDao<Hero extends Serializable>{
    
    List<Hero> findHeroes(DBObject dbo);
}
