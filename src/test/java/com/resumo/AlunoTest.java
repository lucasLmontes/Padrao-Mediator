package com.resumo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void deveFazerElogioParaCoordenacao(){
        Aluno aluno = new Aluno();
        aluno.fazerElogio("Bom serviço");

        assertEquals("||A coordenação respondeu sua mensagem.\n" +
                "-> ||A coordenação agradece o contato!\n" +
                "||Feedback: Bom serviço", aluno.fazerElogio("Bom serviço"));
    }

    @Test
    public void deveFazerSugestaoParaCoordenacao(){
        Aluno aluno = new Aluno();
        aluno.fazerSugestao("Mais conteúdos na semana acadêmica");

        assertEquals("||A coordenação respondeu sua mensagem.\n" +
                "-> ||A coordenação agradece o contato!\n" +
                "||Feedback: Mais conteúdos na semana acadêmica",
                aluno.fazerSugestao("Mais conteúdos na semana acadêmica"));
    }

    @Test
    public void deveFazerCriticaParaCoordenacao(){
        Aluno aluno = new Aluno();
        aluno.fazerCritica("Serviço ruim");

        assertEquals("||A coordenação respondeu sua mensagem.\n" +
                "-> ||A coordenação agradece o contato!\n" +
                "||Feedback: Serviço ruim", aluno.fazerCritica("Serviço ruim"));
    }
}