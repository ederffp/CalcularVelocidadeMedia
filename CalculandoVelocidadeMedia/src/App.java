import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  Algoritmo escrito em java com proposito de calcular a velocidade média. 
 */
public class App {

    public static float calcularVelocidade(float distancia, float tempo){
        return distancia / tempo; 
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println("***** Calculando a velocidade Média *****");
        System.out.println();
        
        float distanciaPercorrida, tempoPercorrido;

        try {
            
            System.out.println("-> Insira a distância em Metros(m): ");
            distanciaPercorrida = scan.nextFloat();

            System.out.println("-> Insira o tempo percorrido: ");
            tempoPercorrido = scan.nextFloat();
            
            if (distanciaPercorrida != 0 && tempoPercorrido != 0) {
            
                System.out.println("-> Velocidade media percorrida é: " + df.format(calcularVelocidade(distanciaPercorrida, tempoPercorrido)) + " Km/h.");
            
            } else {

                System.out.println("Valores invalidado para calculo.");
                System.exit(0);
            }
                  
            scan.close();

            } catch (InputMismatchException e) {
            
            System.out.println("ERROR: ... tipo de dado invalido"); 
        
        }
    }
}
