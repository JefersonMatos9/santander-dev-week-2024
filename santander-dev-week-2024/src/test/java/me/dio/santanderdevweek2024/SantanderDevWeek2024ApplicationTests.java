package me.dio.santanderdevweek2024;

import application.ListChampionsUseCase;
import models.Champions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SantanderDevWeek2024ApplicationTests {
private ListChampionsUseCase listChampionsUseCase;
	@Test
	public void testListChampions() {
		List<Champions> champions = listChampionsUseCase.findAll();

		Assertions.assertEquals(12,champions.size());
	}
}
