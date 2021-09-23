package br.com.mloose.agendavoting.service;

import br.com.mloose.agendavoting.dto.AssociatesDTO;
import br.com.mloose.agendavoting.dto.mapper.AssociatesMapper;
import br.com.mloose.agendavoting.entity.Associates;
import br.com.mloose.agendavoting.repository.AssociatesRepository;
import br.com.mloose.agendavoting.service.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AssociatesService {

    private final AssociatesMapper associatesMapper;
    private final AssociatesRepository associatesRepository;

    public List<AssociatesDTO> findAll() {
        return associatesMapper.toDto(associatesRepository.findAll());
    }

    public AssociatesDTO findById(Long id) {
        return associatesRepository.findById(id).map(associatesMapper::toDto).
                orElseThrow(() -> new ResourceNotFoundException("Usuario não encontrado!"));
    }

    public AssociatesDTO save(AssociatesDTO dto) {
        Associates entity = associatesMapper.toEntity(dto);
        entity = associatesRepository.save(entity);
        return associatesMapper.toDto(entity);
    }

}
