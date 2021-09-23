package br.com.mloose.agendavoting.repositories;

import br.com.mloose.agendavoting.entities.Schedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulesRepository extends JpaRepository<Schedules, Long> {
}
