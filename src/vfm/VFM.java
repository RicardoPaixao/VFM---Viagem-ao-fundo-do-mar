package vfm;

import com.sun.media.sound.InvalidDataException;
import java.util.Scanner;
import vfm.model.Submarino;

/**
 *
 * @author Ricardo Paixão
 */
public class VFM {

    private Submarino sub;
    
    public static void main(String[] args) {
        new VFM().run();
    }

    private void run() {
       //Processamento simples, recebe entrada, processa, envia saida e termina processo.
       //qualquer upgrade (GUI, outras opções e melhorias, inclusão de banco, alteração no
       //processamento, pode ser feito depois.
       Scanner sc = new Scanner(System.in);
       String input = sc.next();
       String output = null;
       sub=new Submarino();
       for (int next=0;next<input.length();next++){
           char comand = input.charAt(next);
           switch(comand){
               case 'L': sub.left();break;
               case 'R': sub.right();break; 
               case 'M': sub.move(); break; 
               case 'U': sub.setZ(sub.getZ()+1); break; 
               case 'D': sub.setZ(sub.getZ()-1); break;
               default:
           }
       }
       output = sub.report();
       System.out.println(output);
    }
    
}
