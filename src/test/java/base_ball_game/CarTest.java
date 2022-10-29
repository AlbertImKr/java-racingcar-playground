package base_ball_game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	void car_can_move() {
		Car car = new Car();
		assertThat(car.canMove(5)).isTrue();

		assertThat(car.canMove(4)).isFalse();
	}
}
