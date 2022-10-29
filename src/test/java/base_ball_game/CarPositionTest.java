package base_ball_game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarPositionTest {

	@Test
	void position_move() {
		CarPosition carPosition = new CarPosition(3);
		assertThat(carPosition.move()).isEqualTo(new CarPosition(4));
	}
}
