package br.com.wildfire.system.repositories;

import br.com.wildfire.system.entities.Coleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColetaRepository extends JpaRepository<Coleta, Integer> {
}
