package Src.Controle.financeiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import Src.Controle.financeiro.model.Transacao;
import Src.Controle.financeiro.service.TransacaoService;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoService service;

    @PostMapping
    public Transacao criar(@RequestBody Transacao transacao) {
        return service.salvar(transacao);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Transacao> listarPorUsuario(@PathVariable Long usuarioId) {
        return service.listarPorUsuario(usuarioId);
    }

    @GetMapping("/saldo/{usuarioId}")
    public Double calcularSaldo(@PathVariable Long usuarioId) {
        return service.calcularSaldo(usuarioId);
    }

}
