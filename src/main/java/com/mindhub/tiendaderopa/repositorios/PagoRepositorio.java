package com.mindhub.tiendaderopa.repositorios;

import com.mindhub.tiendaderopa.modelos.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PagoRepositorio extends JpaRepository<Pago, Long> {
}
