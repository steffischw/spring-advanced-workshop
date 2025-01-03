package de.codecentric.app;

import de.codecentric.app.model.Farmer;
import de.codecentric.app.service.FarmerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private FarmerService farmerService;

    @Test
    public void testFindAllFarmers() {
        List<Farmer> farmers = this.farmerService.findFarmers();
        assertThat(farmers).isNotNull();
        assertThat(farmers.size()).isEqualTo(2);
    }

    @Test
    public void testFindFarmerByLastname() {
        Farmer farmer = this.farmerService.findFarmerByLastName("Bauer");
        assertThat(farmer).isNotNull();
        assertThat(farmer.getFirstName()).isEqualTo("Benjamin");
    }

}
