package Src.Controle.financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Src.Controle.financeiro.model.Transacao;
import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    List<Transacao> findByUsuario(Long usuarioId);

}
