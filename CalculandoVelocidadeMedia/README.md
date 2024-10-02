<h1> Código Verifica a Velocidade Media. </h1>

```java
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

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
```

<h2><b><i> Descrição: </i></b></h2>

<h3>Abaixo invocamos 3 imports:</h3> 

```java
    import java.util.InputMismatchException;
    import java.util.Scanner;
    import java.text.DecimalFormat;
```
a) <b><u>import java.util.InputMismatchException;</u></b>
<p> Invocamos esse import com a finalidade de tratar problemas de entrada de tipo de dado no nosso programa, exemplo, se caso o campo esteja solicitando a entrada de um tipo de dado de tipo <b>int</b> e o usuário fazer uma entraada com uma <b>String</b> logo será invocado uma chamada de exceção advertindo em relação a esse tipo de dado. 

b) <b><u>import java.util.Scanner;</u></b>
<p> Aqui invocamos mais outro import padrão do Java para tratar entradas via console. Esse import é responsável por coletar a entrada do usuário, chamando a classe <b>Scannner</b> para isso.

c) <b><u>import java.text.DecimalFormat;</u></b>

<p> Por ultimo invocamos a biblioteca que trata o formato da saida dos dados em tela para dados decimais, ou seja, definimos quantos digitos estão após a virgula.

- Criamos uma class de tipo public chamada App. É nela que estara todas as outras classes incluindo o metodo <b>main</b> 
- Criamos uma class public de tipo float, ou seja, que retornara valor de tipo float chamada <b> calcularVelocidade(float distancia, float tempo)</b>, veja que junto estamos passando 2 argumentos, um que tratara o dado relacionado a distancia e outro que tratara de armazenará dado relacionado ao tempo.
- Observamos também o retorno que a função esta fazendo, que é de tipo float:
```java
    return distancia / tempo;
```

<h2> Mas o que há de diferente nesse código ?</h2>

```java
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
```

- Acima colocamos todas as solicitações de entrada do usuário dentro do bloco <b>try-catch{}</b> isso porque queremos tratar entradas de tipo incorreto de dados.
- Outra ação em complemento ao try-catch foi uma verificação usando condicionais <b>(if-else)</b>.

[Sobre tratamento de exceção try-catch{} ()](https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html)