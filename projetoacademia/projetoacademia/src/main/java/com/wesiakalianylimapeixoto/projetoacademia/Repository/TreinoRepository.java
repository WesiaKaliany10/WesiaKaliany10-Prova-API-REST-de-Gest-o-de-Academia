package com.wesiakalianylimapeixoto.projetoacademia.Repository;

import com.wesiakalianylimapeixoto.projetoacademia.Model.Treino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Long> {
}

