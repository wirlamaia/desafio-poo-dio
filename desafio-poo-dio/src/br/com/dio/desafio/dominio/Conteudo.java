package br.com.dio.desafio.dominio;

public abstract class Conteudo { //abstrat = não consigo instanciar um conteúdo

    protected static final double XP_PADRAO = 10d; // final = constante, static = poder acessar fora dessa classe Conteudo
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
