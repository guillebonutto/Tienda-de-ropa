package com.mindhub.tiendaderopa.repositorios;

import com.mindhub.tiendaderopa.modelos.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InventarioRepositorio extends JpaRepository<Inventario, Long> {
}
