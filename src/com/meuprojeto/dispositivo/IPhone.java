package com.meuprojeto.dispositivo;

import com.meuprojeto.funcionalidades.musica.ReprodutorMusical;
import com.meuprojeto.funcionalidades.internet.NavegadorInternet;
import com.meuprojeto.funcionalidades.telefone.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico{

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
            System.out.println("Musica selecionada");
        }

        @Override
        public void fazerChamada(){
            System.out.println("Iniciando chamada...");
        }

        @Override
        public void atender(){
            System.out.println("atendendo chamada");
        }

        @Override
        public void iniciarCorreioVoz(){
            System.out.println("Deixe sua mensagem...");
        }

        public static void main(String[] args) {

            IPhone iPhone = new IPhone();

            iPhone.selecionarMusica();
            iPhone.reproduzirMusica();
            iPhone.pausarMusica();
            iPhone.atender();
            iPhone.fazerChamada();
            iPhone.iniciarCorreioVoz();
        
        }

}
