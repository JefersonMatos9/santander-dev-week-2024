package application;

import models.Champions;
import ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {

    public List<Champions> findAll(){

        return repository.findAll();
    }
}
