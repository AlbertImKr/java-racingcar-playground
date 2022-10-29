package base_ball_game;

import java.util.Random;

public class RandomNumber {
	private static final Random random = new Random();

	public static int creatNumber() {
		return random.nextInt(10);
	}
}
