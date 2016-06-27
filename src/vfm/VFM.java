package vfm;

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
       System.out.println(output);
    }
    
}
