package com.wesiakalianylimapeixoto.projetoacademia.Service;

import com.wesiakalianylimapeixoto.projetoacademia.Model.Plano;
import com.wesiakalianylimapeixoto.projetoacademia.Repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class PlanoService {

    @Autowired
    private PlanoRepository repository;

    public Plano salvar(Plano plano) {
        return repository.save(plano);
    }

    public List<Plano> listarTodos() {
        return repository.findAll();
    }

    public Plano buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Plano não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}

