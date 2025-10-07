package com.wesiakalianylimapeixoto.projetoacademia.Controller;

import com.wesiakalianylimapeixoto.projetoacademia.Dto.AlunoTreinoVinculoDTO;
import com.wesiakalianylimapeixoto.projetoacademia.Model.AlunoTreinoVinculo;
import com.wesiakalianylimapeixoto.projetoacademia.Service.AlunoTreinoVinculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/vinculos")
public class AlunoTreinoVinculoController {

    private final AlunoTreinoVinculoService vinculoService;

    public AlunoTreinoVinculoController(AlunoTreinoVinculoService vinculoService) {
        this.vinculoService = vinculoService;
    }

    @PostMapping
    public AlunoTreinoVinculoDTO criarVinculo(@RequestBody AlunoTreinoVinculoDTO dto) {
        AlunoTreinoVinculo vinculo = vinculoService.criarVinculo(dto.getAlunoId(), dto.getTreinoId());
        return converterParaDTO(vinculo);
    }

    @GetMapping("/aluno/{alunoId}")
    public List<AlunoTreinoVinculoDTO> listarPorAluno(@PathVariable Long alunoId) {
        return vinculoService.listarPorAluno(alunoId)
                .stream()
                .map(this::converterParaDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/treino/{treinoId}")
    public List<AlunoTreinoVinculoDTO> listarPorTreino(@PathVariable Long treinoId) {
        return vinculoService.listarPorTreino(treinoId)
                .stream()
                .map(this::converterParaDTO)
                .collect(Collectors.toList());
    }

    @DeleteMapping
    public void deletarVinculo(@RequestBody AlunoTreinoVinculoDTO dto) {
        vinculoService.deletarVinculo(dto.getAlunoId(), dto.getTreinoId());
    }

    private AlunoTreinoVinculoDTO converterParaDTO(AlunoTreinoVinculo vinculo) {
        AlunoTreinoVinculoDTO dto = new AlunoTreinoVinculoDTO();
        dto.setAlunoId(vinculo.getAluno().getId());
        dto.setTreinoId(vinculo.getTreino().getId());
        dto.setDataAssociacao(vinculo.getDataAssociacao());
        return dto;
    }
}


