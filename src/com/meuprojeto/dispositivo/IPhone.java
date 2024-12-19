package com.meuprojeto.dispositivo;

import com.meuprojeto.funcionalidades.musica.ReprodutorMusical;
import com.meuprojeto.funcionalidades.internet.NavegadorInternet;
import com.meuprojeto.funcionalidades.telefone.AparelhoTelefonico;

public class IPhone implements Dispositivo, ReprodutorMusical{
        
        @Override
        public void ligar(){
            System.out.println("Telefone Ligado");
        }

        @Override
        public void desligar(){
            System.out.println("Telefone Desligado");
        }

        @Override
        public void reproduzirMusica(){
            System.out.println("Reproduzindo música...");
        }

        @Override
        public void pausarMusica(){
            System.out.println("Musica pausada");
        }

        @Override
        public void selecionarMusica(){
            System.out.println("Musica selecionada " + nome);
        }

public static void main(String[] args) {

    IPhone meuIPhone = new IPhone();

    meuIPhone.selecionarMusica("Imagine - John Lennon");
    meuIPhone.reproduzirMusica("Imagine");
    meuIPhone.pausarMusica();

}

}
