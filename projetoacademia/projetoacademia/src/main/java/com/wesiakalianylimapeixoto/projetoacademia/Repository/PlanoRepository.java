package com.wesiakalianylimapeixoto.projetoacademia.Repository;

import com.wesiakalianylimapeixoto.projetoacademia.Model.Plano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoRepository extends JpaRepository<Plano, Long> {
}

