package lista1;

import java.io.IOException;
import java.util.Scanner;

public class URI1017
{	
    public static void main(String[] args) throws IOException
    {
        Scanner teclado = new Scanner(System.in);
        int tempo = teclado.nextInt();
        int velocidade = teclado.nextInt();
        double kilometros = tempo * velocidade;
        double media = kilometros / 12;
        System.out.println(String.format("%.3f", media)); 
    }
	
}