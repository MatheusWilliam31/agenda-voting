package br.com.mloose.agendavoting.repositories;

import br.com.mloose.agendavoting.entities.Votes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotesRepository extends JpaRepository<Votes, Long> {
}
