package com.exce.resource;

import com.exce.domain.Programador;
import com.exce.exception.ProgramadorIdNotFoundException;
import com.exce.service.ProgramadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("programador")
public class ProgramadorResource {

    @Autowired
    private ProgramadorService programadorService;

    @GetMapping("/{id}")
    public Programador findById(@PathVariable Long id) throws ProgramadorIdNotFoundException {
        return programadorService.findOne(id);
    }
}
