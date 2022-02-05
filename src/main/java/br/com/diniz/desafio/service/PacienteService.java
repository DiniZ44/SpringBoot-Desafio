package br.com.diniz.desafio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.diniz.desafio.entity.Paciente;
import br.com.diniz.desafio.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> listaPaciente(){
        return pacienteRepository.findAll();
    }
    
    public Optional<Paciente> buscarId(Long id){
        return pacienteRepository.findById(id);
    }
    
    public List<Paciente> listaPacienteOrdenada(String string){
        return pacienteRepository.findAll();
    }
}
