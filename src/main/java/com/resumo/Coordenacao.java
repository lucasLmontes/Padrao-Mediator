package com.resumo;

public class Coordenacao implements ICoordenacao {

    private static Coordenacao instance = new Coordenacao();

    public Coordenacao() {}

    public static Coordenacao getInstance(){
        return instance;
    }

    public String receberElogio(String mensagem){
        return "||A coordenação agradece o contato!\n" +
                "||Feedback: "+ mensagem;
    }

    public String receberSugestao(String mensagem){
        return "||A coordenação agradece o contato!\n" +
                "||Feedback: "+ mensagem;
    }

    public String receberCritica(String mensagem){
        return "||A coordenação agradece o contato!\n" +
                "||Feedback: "+ mensagem;
    }
}
