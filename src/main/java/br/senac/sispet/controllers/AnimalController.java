package br.senac.sispet.controllers;

import br.senac.sispet.dto.AnimalDTO;
import br.senac.sispet.entidades.Animal;
import br.senac.sispet.repositorios.AnimalRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AnimalController {

    @Autowired
    AnimalRepositorio animalRepositorio;

    @GetMapping("/animals")
    public List<Animal> listarAnimais(){
       return animalRepositorio.findAll();
    }

    @PostMapping("/animals")
    public Animal criarAnimal(@RequestBody AnimalDTO animalDTO){
        Animal animalNovo = new Animal();

        animalNovo.setNome(animalDTO.getNome());
        animalNovo.setCor(animalDTO.getCor());
        animalNovo.setEspecie(animalDTO.getEspecie());
        animalNovo.setTemperamento(animalDTO.getTemperamento());
        animalNovo.setDataNascimento(animalDTO.getDataNascimento());
        animalNovo.setNomeResponsavel(animalDTO.getNomeResponsavel());

        return animalRepositorio.save(animalNovo);
    }

    @PutMapping("/animals/{id}")
    public Animal editarAnimal(@PathVariable long id, @RequestBody AnimalDTO animalDTO){

        Optional<Animal> animalEncontrado = animalRepositorio.findById(id);

        animalEncontrado.get().setNome(animalDTO.getNome());
        animalEncontrado.get().setCor(animalDTO.getCor());
        animalEncontrado.get().setEspecie(animalDTO.getEspecie());
        animalEncontrado.get().setTemperamento(animalDTO.getTemperamento());
        animalEncontrado.get().setDataNascimento(animalDTO.getDataNascimento());
        animalEncontrado.get().setNomeResponsavel(animalDTO.getNomeResponsavel());

        return animalRepositorio.save(animalEncontrado.get());
    }

    @DeleteMapping("/animals/{id}")
    public void deletarAnimal(@PathVariable long id){
        animalRepositorio.deleteById(id);
    }
}
