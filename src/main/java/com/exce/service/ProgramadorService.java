package com.exce.service;

import com.exce.domain.Programador;
import com.exce.exception.ProgramadorIdNotFoundException;
import com.exce.repository.ProgramadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProgramadorService {

    @Autowired
    private ProgramadorRepository programadorRepository;

    public Programador findOne(Long id) throws ProgramadorIdNotFoundException {
        Optional<Programador> optional= programadorRepository.findById(id);
        if(!optional.isPresent())
            throw new ProgramadorIdNotFoundException("Programador con id: "+id+" no encontrado");

        return null;
    }
}
