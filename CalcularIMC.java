import java.io.IOException;
import java.util.Scanner;
// 1. importando a classe Scanner

public class CalcularIMC {

  public static void main(String[] args) throws IOException {
    Scanner lerTeclado = new Scanner(System.in);
    // 2. instanciando e criando um objeto Scanner
   String nome;
   char sexo;
   double altura;
   double peso;

   System.out.printf("Informe um nome:\n");
   nome = lerTeclado.nextLine();
   // 3. entrada de dados (lendo uma String)

   System.out.printf(" \n Informe o sexo (M/F/N): \n");
   sexo = (char)System.in.read();
   // entrada de dados (lendo um caractere)

   System.out.println("\n Informe a sua altura: \n");
    altura = lerTeclado.nextDouble();

    System.out.println("\n Informe o seu peso: \n");
    peso = lerTeclado.nextDouble();

    double imc = calcularIMC(peso, altura);
    String classificacao = "";

    if ((sexo == 'M') || (sexo == 'm')){
        if (imc >= 40){
            classificacao = "Obesidade mórbida";
        }
        else if ((imc > 30) && (imc < 39.9)){
            classificacao = "Obesidade moderada";
        }
        else if ((imc > 25) && (imc < 29.9)){
            classificacao = "Obesidade leve";
        }
        else if ((imc > 20) && (imc < 24.9)){
            classificacao = "Normal";
        }
        else{
            classificacao = "Abaixo do normal";
        }
    }       
    else if ((sexo == 'F') || (sexo == 'f') || (sexo == 'N') || (sexo == 'n')){
        if (imc >= 39){
            classificacao = "Obesidade mórbida";
        }
        else if ((imc > 29) && (imc < 38.9)){
            classificacao = "Obesidade moderada";
        }
        else if ((imc > 24) && (imc < 28.9)){
            classificacao = "Obesidade leve";
        }
        else if ((imc > 19) && (imc < 23.9)){
            classificacao = "Normal";
        }
        else{
            classificacao = "Abaixo do normal";
        }
    }
    else{
        System.out.printf("Por favor digite uma opção válida para o sexo. \n");
    }

    System.out.printf("\n" + nome + " seu imc é: " + imc + ". E sua classificação é: " + classificacao + ". \n");
    lerTeclado.close();
  }

    public static double calcularIMC(double peso, double altura){
        return (peso/Math.pow(altura, 2));
    }
}