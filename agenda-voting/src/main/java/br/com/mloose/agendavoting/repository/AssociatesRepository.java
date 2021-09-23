package br.com.mloose.agendavoting.repository;

import br.com.mloose.agendavoting.entity.Associates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociatesRepository extends JpaRepository<Associates, Long> {
}
