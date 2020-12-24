package br.com.apisistemagestao.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apisistemagestao.domain.entity.ContasPagarDetalhe;
import br.com.apisistemagestao.infra.ContasapagarDetalheRepositorryQuery;


@Repository
public interface ContasapagarDetalheRepositorry extends JpaRepository<ContasPagarDetalhe, Long>,ContasapagarDetalheRepositorryQuery{

}
