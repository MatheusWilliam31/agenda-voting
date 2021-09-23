package br.com.mloose.agendavoting.repositories;

import br.com.mloose.agendavoting.entities.Associates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociatesRepository extends JpaRepository<Associates, Long> {
}
