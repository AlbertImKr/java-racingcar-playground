package car_game;

import java.util.Scanner;

public class InputView {
	private final Scanner scanner = new Scanner(System.in);

	String inputCarName(){
		return scanner.next();
	}

	int inputRepeatNum() {
		return scanner.nextInt();
	}
}
