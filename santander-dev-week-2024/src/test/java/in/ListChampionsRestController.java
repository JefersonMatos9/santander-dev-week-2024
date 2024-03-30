package in;

import application.ListChampionsUseCase;
import models.Champions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name ="Campões", descripition = "Endpoints do dominio de campões do Lol")
@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {
    @GetMapping
    public List<Champions> findAllChampions(){
        return useCase.findAll();
    }

}
