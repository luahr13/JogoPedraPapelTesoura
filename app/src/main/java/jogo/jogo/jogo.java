package jogo.jogo;

import java.util.Random;
import java.util.Scanner;

public class jogo {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    String pedra = "pedra";
    String papel = "papel";
    String tesoura = "tesoura";
    String result;
    String resultIa;

    System.out.print("Escolha um objeto: \n-pedra\n-papel\n-tesoura\n");
    result = ler.next();
    resultIa = jogadaIA();
    System.out.println("Jogador: " + result + "\nJogador IA: " + resultIa);

    if (result.equalsIgnoreCase(resultIa)) {
      System.out.println("Empate");
    } else if ((result.equalsIgnoreCase("pedra")) && (resultIa.equalsIgnoreCase("tesoura"))) {
      System.out.println("Vitoria");
    } else if ((result.equalsIgnoreCase("papel")) && (resultIa.equalsIgnoreCase("pedra"))) {
      System.out.print("Vitoria");
    } else if ((result.equalsIgnoreCase("tesoura")) && (resultIa.equalsIgnoreCase("papel"))) {
      System.out.println("Vitoria");
    } else {
      System.out.println("Derrota");
    }
  }

  public static String jogadaIA() {
    Random gerador = new Random();
    int opcao = gerador.nextInt(3);

    String[] listaOpcoes = {"pedra", "papel", "tesoura"};
    return listaOpcoes[opcao];
  }
}
