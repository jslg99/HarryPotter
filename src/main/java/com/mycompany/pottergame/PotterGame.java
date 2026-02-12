
package com.mycompany.pottergame;
import com.mycompany.pottergame.Spells.Expelliarmus;
import com.mycompany.pottergame.Wizards.HarryPotter;
import com.mycompany.pottergame.Wizards.Wizard;

public class PotterGame {
    public static void main(String[] args) {
        
        Wizard Harry = new HarryPotter();
        Harry.display();
        Harry.performSpell(); 

        System.out.println("New Spell");

        Harry.setSpellsUse(new Expelliarmus()); 
        Harry.performSpell();   
    }
}
