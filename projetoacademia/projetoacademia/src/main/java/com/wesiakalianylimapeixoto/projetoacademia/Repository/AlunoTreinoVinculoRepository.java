package com.wesiakalianylimapeixoto.projetoacademia.Repository;

import com.wesiakalianylimapeixoto.projetoacademia.Model.AlunoTreinoId;
import com.wesiakalianylimapeixoto.projetoacademia.Model.AlunoTreinoVinculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoTreinoVinculoRepository extends JpaRepository<AlunoTreinoVinculo, AlunoTreinoId> {

    List<AlunoTreinoVinculo> findByAlunoId(Long alunoId);
    List<AlunoTreinoVinculo> findByTreinoId(Long treinoId);
    boolean existsByAlunoIdAndTreinoId(Long alunoId, Long treinoId);
}

