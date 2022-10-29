package car_game;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CarGameTest {

	@Test
	void 자동차이름은쉼표로구분(){
		CarGame carGame = new CarGame("pobi,crong,honux");
		List<String> carNameList = carGame.getCarNameList();
		assertThat(carNameList.get(0)).isEqualTo("pobi");
		assertThat(carNameList.get(1)).isEqualTo("crong");
		assertThat(carNameList.get(2)).isEqualTo("honux");
	}

}
