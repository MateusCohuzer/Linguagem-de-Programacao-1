package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mateus CohuzEr
 */
public class ControleDeCards {

    List<Deck> Decks = new ArrayList<>();

    public void add(Deck Yu_Gi_Oh) {
        Decks.add(Yu_Gi_Oh);
    }
    
    public Deck buscar(int goal_id){
        for (int i = 0; i < Decks.size(); i++) {
            if (goal_id == Decks.get(i).getCard_id()) {
                return Decks.get(i);
            }
        }
        return null;
    }
    
    public void atualizar(Deck atual, Deck modificado){
        Decks.set(Decks.indexOf(atual), modificado);
    }
    
    public void excluir(Deck yugioh){
        Decks.remove(yugioh);
    }
    
    public List<Deck> listar(){
        return Decks;
    }
}
