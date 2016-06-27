package vfm;

import com.sun.media.sound.InvalidDataException;
import controller.Navegador;
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
           char comando = input.charAt(next);
           Navegador.navegar(comando, sub);
       }
       output = sub.report();
       System.out.println(output);
    }
    
}
