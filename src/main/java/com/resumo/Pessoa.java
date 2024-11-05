package com.resumo;

public class Pessoa {

    public String fazerElogio(String mensagem){
        return Representante.getInstance().respostaElogioCoordenacao(mensagem);
    }

    public String fazerSugestao(String mensagem){
        return Representante.getInstance().respostaSugestaoCoordenacao(mensagem);
    }

    public String fazerCritica(String mensagem){
        return Representante.getInstance().respostaCriticaCoordenacao(mensagem);
    }
}
