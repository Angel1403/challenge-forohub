package com.angelv.forohub.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
    @Query("""
            SELECT t FROM Topico t
            ORDER BY
            t.fechaCreacion
            ASC
            """)
    Page<Topico> ordenarPorFechaCreacion(Pageable paginacion);

    
    boolean existsByTitulo(String titulo);

    boolean existsByMensaje(String mensaje);
}
