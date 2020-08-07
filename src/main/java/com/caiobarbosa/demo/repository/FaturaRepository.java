package com.caiobarbosa.demo.repository;

import com.caiobarbosa.demo.domain.Fatura;
import com.caiobarbosa.demo.domain.Instalacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {
	public Optional<Fatura> findByCodigo(String codigo);
	public List<Fatura> findByInstalacao(Instalacao instalacao);
}
