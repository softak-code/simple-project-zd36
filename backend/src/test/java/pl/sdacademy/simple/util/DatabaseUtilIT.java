package pl.sdacademy.simple.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import pl.sdacademy.simple.data.CarEntity;

class DatabaseUtilIT {

	private EntityManager entityManager;

	@BeforeEach
	void setUp() {
		entityManager = DatabaseUtil.getEntityManager();
	}

	@Test
	void shouldFindCars() {
		Query query = entityManager.createQuery("select car from CarEntity car", CarEntity.class);

		List<CarEntity> result = query.getResultList();

		assertThat(result).hasSize(8);
		assertThat(result.get(0).getAttributes()).hasSize(2);
		assertThat(result.get(1).getAttributes()).hasSize(1);
		assertThat(result.get(1).getPrice()).isEqualTo(BigDecimal.valueOf(7.5));

	}
}
