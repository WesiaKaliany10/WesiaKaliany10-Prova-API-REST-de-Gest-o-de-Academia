package com.wesiakalianylimapeixoto.projetoacademia.Dto;

import com.wesiakalianylimapeixoto.projetoacademia.Model.Treino;

public class TreinoDTO {

    private Long id;
    private String nome;
    private String descricao;
    private Treino.NivelTreino nivel;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Treino.NivelTreino getNivel() { return nivel; }
    public void setNivel(Treino.NivelTreino nivel) { this.nivel = nivel; }
}