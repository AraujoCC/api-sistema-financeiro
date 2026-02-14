package Src.Controle.financeiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import Src.Controle.financeiro.model.Transacao;
import Src.Controle.financeiro.repository.TransacaoRepository;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository repository;

    public Transacao salvar(Transacao transacao) {
        return repository.save(transacao);
    }

    public List<Transacao> listarPorUsuario(Long usuarioId) {
        return repository.findByUsuario(usuarioId);
    }

    public Double calcularSaldo(Long usuarioId) {

        List<Transacao> lista = repository.findByUsuario(usuarioId);

        double saldo = 0;

        for (Transacao t : lista) {

            if (t.getTipo().equalsIgnoreCase("RECEITA")) {
                saldo += t.getValor();
            } else {
                saldo -= t.getValor();
            }
        }

        return saldo;
    }

}
