package base_ball_game;

public class CarGame {
	private final Cars cars;
	private final int repeatNum;

	public CarGame(String name, int inputRepeatNum) {
		this.cars = new Cars(name);
		this.repeatNum = inputRepeatNum;
	}

	public void start() {
		for (int i = 0; i < repeatNum; i++) {
			cars.moveRandom();
			OutputView.print(cars);
		}
	}

	public void getWinner() {
		Car maxCar = cars.getMaxCar();
		Cars winner = cars.getWinner(maxCar);
		OutputView.printWinner(winner);
	}
}
