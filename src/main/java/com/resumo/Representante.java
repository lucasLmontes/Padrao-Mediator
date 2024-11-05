package com.resumo;

public class Representante {

    private static Representante instance = new Representante();

    public Representante() {}

    public static Representante getInstance(){
        return instance;
    }

    public String respostaElogioCoordenacao(String mensagem){
        return "||A coordenação respondeu sua mensagem.\n" +
                "-> " + Coordenacao.getInstance().receberElogio(mensagem);
    }

    public String respostaSugestaoCoordenacao(String mensagem){
        return "||A coordenação respondeu sua mensagem.\n" +
                "-> " + Coordenacao.getInstance().receberSugestao(mensagem);
    }

    public String respostaCriticaCoordenacao(String mensagem){
        return "||A coordenação respondeu sua mensagem.\n" +
                "-> " + Coordenacao.getInstance().receberCritica(mensagem);
    }
}
