package com.mindhub.tiendaderopa.repositorios;

import com.mindhub.tiendaderopa.modelos.ClienteArticulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClienteArticuloRepositorio extends JpaRepository<ClienteArticulo, Long> {
}
