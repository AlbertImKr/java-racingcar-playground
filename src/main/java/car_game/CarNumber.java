package car_game;

public class CarNumber {
	private String carName;

	public CarNumber(String name) {
		if (name.length() > 5) {
			throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없다.");
		}
		this.carName = name;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
}
