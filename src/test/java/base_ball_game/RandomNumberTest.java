package base_ball_game;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RandomNumberTest {

	@Test
	void random_number_0_9(){
		assertThat(RandomNumber.creatNumber())
			.isLessThanOrEqualTo(9)
			.isGreaterThanOrEqualTo(0);
	}
}
