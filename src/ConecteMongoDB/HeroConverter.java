/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConecteMongoDB;

import OOClasses.Hero;
import com.mongodb.DBObject;

/**
 *
 * @author alexandra
 */
public class HeroConverter {
    
    public static Hero converterToContato(DBObject dbo) {
        Hero contato = new Hero();

        contato.setId((String) dbo.get("_id"));
        contato.setNome((String) dbo.get("nome"));
        contato.setIdade((Integer) dbo.get("idade"));
        contato.setTarefas((List<String>) dbo.get("tarefas"));

        return contato;
    }
    
}
