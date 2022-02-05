package br.com.diniz.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.diniz.desafio.entity.Paciente;

public interface PacienteRepository extends JpaRepository <Paciente, Long> {
    

    
}
