package com.senac;

public class Main {

    public static void main(String[] args) {
        // pedra ganha de tesoura
        // tesoura ganha do papel
        // papel ganha de pedra

        String nomeJogador1 = "Pedrao";
        String nomeJogador2 = "Fabiano";
        String jogadaJogador1 = "Pedra";
        String jogadaJogador2 = "Tesoura";

        if (jogadaJogador1 == "Pedra" && jogadaJogador2 == "Papel"){
            System.out.println(nomeJogador2 + " ganhou");
        }

        if (jogadaJogador1.equals("Pedra") && jogadaJogador2.equals("Tesoura")){
            System.out.println(nomeJogador1 + " ganhou");
        }

        if (jogadaJogador2.equals(jogadaJogador1)){
            System.out.println("Empate");
        }

        if (jogadaJogador1 == "Papel" && jogadaJogador2 == "Pedra"){
            System.out.println(nomeJogador1 + " ganhou");
        }
    }
}
