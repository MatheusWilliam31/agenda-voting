package br.com.mloose.agendavoting.service;

import br.com.mloose.agendavoting.dto.SchedulesDTO;
import br.com.mloose.agendavoting.dto.mapper.SchedulesMapper;
import br.com.mloose.agendavoting.entity.Schedules;
import br.com.mloose.agendavoting.repository.SchedulesRepository;
import br.com.mloose.agendavoting.service.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SchedulesService {

    private final SchedulesMapper schedulesMapper;
    private final SchedulesRepository schedulesRepository;

    public List<SchedulesDTO> findAll() {
        return schedulesMapper.toDto(schedulesRepository.findAll());
    }

    public SchedulesDTO findById(Long id) {
        return schedulesRepository.findById(id).map(schedulesMapper::toDto).
                orElseThrow(() -> new ResourceNotFoundException("Usuario não encontrado!"));
    }

    public SchedulesDTO save(SchedulesDTO dto) {
        Schedules entity = schedulesMapper.toEntity(dto);
        schedulesRepository.save(entity);
        return schedulesMapper.toDto(entity);
    }

}
