package com.wesiakalianylimapeixoto.projetoacademia.Repository;

import com.wesiakalianylimapeixoto.projetoacademia.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    boolean existsByCpf(String cpf);

}
