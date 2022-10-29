package car_game;

import java.util.List;

public class CarGame {
	private final List<String> carNameList;
	public CarGame(String string) {
		carNameList = List.of(string.split(","));
	}

	public List<String> getCarNameList() {
		return carNameList;
	}
}
