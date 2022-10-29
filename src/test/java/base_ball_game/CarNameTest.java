package base_ball_game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarNameTest {

	@Test
	void car_name_range() {
		assertThatExceptionOfType(IllegalArgumentException.class)
			.isThrownBy(() -> new CarName("cccccc"))
			.withMessage("자동차 이름은 5자를 초과할 수 없다");

		assertThatCode(() -> new CarName("ccccc")).doesNotThrowAnyException();
	}
}
