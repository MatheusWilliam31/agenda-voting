package br.com.mloose.agendavoting.repository;

import br.com.mloose.agendavoting.entity.Votes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotesRepository extends JpaRepository<Votes, Long> {
}
