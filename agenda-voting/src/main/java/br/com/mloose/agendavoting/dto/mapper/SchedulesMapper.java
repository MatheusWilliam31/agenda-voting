package br.com.mloose.agendavoting.dto.mapper;

import br.com.mloose.agendavoting.dto.SchedulesDTO;
import br.com.mloose.agendavoting.entity.Schedules;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SchedulesMapper extends EntityMapper<SchedulesDTO, Schedules> {
}
