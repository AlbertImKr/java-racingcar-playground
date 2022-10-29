package base_ball_game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
	private Car car;

	@BeforeEach
	void setCar() {
		Car car = new Car();
	}

	@Test
	void car_can_move() {
		assertThat(car.canMove(5)).isTrue();
		assertThat(car.canMove(4)).isFalse();

	}

}
