package com.mindhub.tiendaderopa.repositorios;

import com.mindhub.tiendaderopa.modelos.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ArticuloRepositorio extends JpaRepository<Articulo, Long> {
}
