package base_ball_game;

public class OutputView {

	public static void print(Cars cars) {
		System.out.println(cars.toString());
	}

	public static void printWinner(Cars cars) {
		System.out.print(cars.getWinnerName());
		System.out.println("가 최종 우승했습니다.");
	}
}
