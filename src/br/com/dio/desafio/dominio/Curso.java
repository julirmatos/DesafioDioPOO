package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private Int CargaHoraria;

    public Curso() {

    }

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

    public Int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
