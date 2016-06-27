/*
 * Regras de negociod e navegação apenas aqui
 */
package controller;

import vfm.model.Submarino;

/**
 *
 * @author ric
 */
public class Navegador {
    public static void navegar (char comando, Submarino sub){
        switch(comando){
               case 'L': sub.left();break;
               case 'R': sub.right();break; 
               case 'M': sub.move(); break; 
               case 'U': sub.setZ(sub.getZ()+1); break; 
               case 'D': sub.setZ(sub.getZ()-1); break;
               default:
           }
    }
}
