package br.com.mloose.agendavoting.dto.mapper;

import br.com.mloose.agendavoting.dto.AssociatesDTO;
import br.com.mloose.agendavoting.entity.Associates;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AssociatesMapper extends EntityMapper<AssociatesDTO, Associates> {
}
