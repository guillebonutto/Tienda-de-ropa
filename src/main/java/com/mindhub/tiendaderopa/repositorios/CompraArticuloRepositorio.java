package com.mindhub.tiendaderopa.repositorios;

import com.mindhub.tiendaderopa.modelos.CompraArticulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompraArticuloRepositorio extends JpaRepository<CompraArticulos, Long> {
}
