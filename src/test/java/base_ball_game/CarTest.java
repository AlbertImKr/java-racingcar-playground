package base_ball_game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {
	private Car car;

	@Test
	void car_can_move() {
		Car car = new Car(1, "fobi");
		assertThat(car.canMove(5)).isTrue();
		assertThat(car.canMove(4)).isFalse();
	}

	@Test
	void car_move() {
		Car fobiCar1 = new Car(1, "fobi");
		Car fobiCar2 = new Car(2, "fobi");
		fobiCar1.move();
		assertThat(fobiCar1).isEqualTo(fobiCar2);
	}

}
