package br.com.alura.regescweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.regescweb.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
