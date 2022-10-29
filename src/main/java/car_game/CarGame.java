package car_game;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarGame {
	private final List<String> carNameList;
	private final List<Car> carList = new ArrayList<>();

	public CarGame(String string) {
		carNameList = List.of(string.split(","));
		initCarList(carNameList);
	}

	private void initCarList(List<String> carNameList) {
		for (String name : carNameList) {
			Car car = new Car(name);
			carList.add(car);
		}
	}

	void start(int repeatNum) {
		for (int i = 0; i < repeatNum; i++) {
			start();
			System.out.println();
		}
	}

	void start() {
		for (Car car : carList) {
			car.go();
			System.out.println(car);
		}
	}
	public List<String> getCarNameList() {
		return carNameList;
	}

	public int getWinnerMaxPosition() {
		return carList.stream()
			.map(Car::getPosition)
			.max(Integer::compareTo).orElse(0);
	}

	public void printWinner() {
		int winnerMaxPosition = getWinnerMaxPosition();
		List<String> winnerNameList = getWinnerNameList(winnerMaxPosition);
		printWinner(winnerNameList);
		System.out.println("가 최종 우승했습니다.");
	}

	private static void printWinner(List<String> winnerNameList) {
		int count = 0;
		while (count != winnerNameList.size()-1){
			System.out.print(winnerNameList.get(count)+",");
			count++;
		}
		System.out.print(winnerNameList.get(count));
	}

	private List<String> getWinnerNameList(int winnerMaxPosition) {
		return carList.stream()
			.filter(car -> car.getPosition() == winnerMaxPosition)
			.map(Car::getName)
			.collect(Collectors.toList());
	}
}
