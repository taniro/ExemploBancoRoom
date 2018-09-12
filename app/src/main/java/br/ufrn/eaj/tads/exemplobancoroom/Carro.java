package br.ufrn.eaj.tads.exemplobancoroom;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;

@Entity(tableName = "tabela_carro")
public class Carro {

    @PrimaryKey (autoGenerate = true)
    private long id;

    private String nome;
    private String tipo;

    @ColumnInfo(name = "descricao")
    private String desc;

    private int ano;

    @Ignore
    private Bitmap imagem;

    public Carro() { }

    public Carro(String nome, String tipo, String desc, int ano) {
        this.ano = ano;
        this.nome = nome;
        this.tipo = tipo;
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Bitmap getImagem() {
        return imagem;
    }

    public void setImagem(Bitmap imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", desc='" + desc + '\'' +
                ", ano=" + ano +
                '}';
    }
}