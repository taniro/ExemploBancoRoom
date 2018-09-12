package br.ufrn.eaj.tads.exemplobancoroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

@Dao
public interface CarroDao {
    @Insert
    long inserir(Carro carro);

    @Delete
    int deletar(Carro carro);

    @Update
    int atualizar(Carro carro);

    @Query("SELECT * FROM tabela_carro")
    Carro[] listAll();

    @Query("SELECT * FROM TABELA_CARRO WHERE id = :id")
    Carro[] listById(long id);
}
