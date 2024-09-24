package main;

import com.example.ChemicalWarehouseProjectApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = ChemicalWarehouseProjectApplication.class)
@ActiveProfiles("test")
public class ChemicalWarehouseProjectApplicationTest {

	@Test
	void contextLoads() {
		// This test will fail if the application context cannot start
	}
}
