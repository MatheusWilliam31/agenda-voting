package br.com.mloose.agendavoting.dto.mapper;

import br.com.mloose.agendavoting.dto.VotesDTO;
import br.com.mloose.agendavoting.entity.Votes;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {AssociatesMapper.class, SchedulesMapper.class})
public interface VotesMapper extends EntityMapper<VotesDTO, Votes> {
}
