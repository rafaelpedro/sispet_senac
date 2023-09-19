package br.senac.sispet.repositorios;

import br.senac.sispet.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface AnimalRepositorio extends JpaRepository<Animal, Long> {

    List<Animal> searchByNome(String nome);

}
