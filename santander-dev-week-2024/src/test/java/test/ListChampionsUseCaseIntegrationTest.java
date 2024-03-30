package test;

import application.ListChampionsUseCase;
import models.Champions;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ListChampionsUseCaseIntegrationTest {

    @Autowired
    private ListChampionsUseCase listChampionsUseCase;
    public void testListChampuins(){
        List<Champions>champions = listChampionsUseCase.findAll();


        Assertions.assertEquals(12,champions.size());
    }
}
