package com.wesiakalianylimapeixoto.projetoacademia.Repository;

import com.wesiakalianylimapeixoto.projetoacademia.Model.Aluno;
import com.wesiakalianylimapeixoto.projetoacademia.Model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    List<Pagamento> findByAluno(Aluno aluno);

    List<Pagamento> findByAlunoAndStatusPagamento(Aluno aluno, Pagamento.StatusPagamento statusPagamento);
}
