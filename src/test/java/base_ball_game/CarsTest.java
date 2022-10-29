package base_ball_game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarsTest {

	@Test
	void string_to_car() {
		Cars cars = new Cars("pobi,crong,honux");
		assertThat(cars.containCar(new Car("pobi"))).isTrue();
		assertThat(cars.containCar(new Car("crong"))).isTrue();
		assertThat(cars.containCar(new Car("nohux"))).isTrue();
	}

	@Test
	void move() {
		Cars cars = new Cars("pobi,crong,honux");
		cars.move();
		assertThat(cars.containCar(new Car(1,"pobi"))).isTrue();
		assertThat(cars.containCar(new Car(1,"crong"))).isTrue();
		assertThat(cars.containCar(new Car(1,"honux"))).isTrue();
	}
}
