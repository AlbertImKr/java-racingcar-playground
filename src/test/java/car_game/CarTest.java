package car_game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

	private Car car;

	@BeforeEach
	void setCar(){
		car = new Car("");
	}

	@Test
	void car_name_size() {
		String name = "jackko";
		assertThatThrownBy(()->car.setName(name)).hasMessage("자동차 이름은 5자를 초과할 없다.");
	}

	@Test
	void car_set_name(){
		car.setName("janko");
		assertThat(car.getName()).isEqualTo("janko");
	}

	@Test
	void car_toString(){
		car.setPosition(3);
		car.setName("janko");
		assertThat(car.toString()).isEqualTo("janko : ---");
	}


	@Test
	void car_go(){
		car.setPosition(3);
		car.go(5);
		assertThat(car.getPosition()).isEqualTo(4);

		car.setPosition(3);
		car.go(4);
		assertThat(car.getPosition()).isEqualTo(3);
	}
}
