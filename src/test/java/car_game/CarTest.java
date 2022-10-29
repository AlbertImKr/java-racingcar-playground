package car_game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	void car_name_size() {
		String name = "jackko";
		assertThatThrownBy(() -> new Car(name)).hasMessage("자동차 이름은 5자를 초과할 없다.");
	}
}
