package com.example.superheltev3.services;

import com.example.superheltev3.model.Superhelt;
import com.example.superheltev3.repositories.SuperheltRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheltService {
    private SuperheltRepository superheltRepository;

    public SuperheltService(SuperheltRepository superheltRepository) {
        this.superheltRepository = superheltRepository;
    }

    public List<Superhelt> getSuperhelte() {
        return superheltRepository.getSuperhelte();
    }

    public List<Superhelt> searchForSuperhero(String searchTerm) {
        return superheltRepository.searchSuperhelt(searchTerm);
    }

    public Superhelt createSuperhelt(String name, String superPower, boolean human, int introYear, double strengthPoint) {
        return superheltRepository.createSuperhero(name, superPower, human, introYear, strengthPoint);
    }

    public void deleteSuperhero(String navn) {
        superheltRepository.deleteSuperhero(navn);
    }
}
