package base_ball_game;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CarsTest {

	@Test
	void string_to_car() {
		Cars cars = new Cars("pobi,crong,honux");
		assertThat(cars.containCar(new Car("pobi"))).isTrue();
		assertThat(cars.containCar(new Car("crong"))).isTrue();
		assertThat(cars.containCar(new Car("honux"))).isTrue();
	}


	@Test
	void get_winner(){
		Car pobiCar = new Car(2, "pobi");
		Car crongCar = new Car(3, "crong");
		Car honuxCar = new Car(4, "honux");
		List<Car> carList = List.of(pobiCar, crongCar, honuxCar);
		Cars cars = new Cars(carList);
		Car maxCar = cars.getMaxCar();
		assertThat(maxCar).isEqualTo(honuxCar);
		assertThat(cars.getWinner(maxCar)).isEqualTo(new Cars(List.of(honuxCar)));

		crongCar.move();
		assertThat(cars.getWinner(maxCar)).isEqualTo(new Cars(List.of(crongCar,honuxCar)));
	}
}
