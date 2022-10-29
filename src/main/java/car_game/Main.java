package car_game;

public class Main {
	public static void main(String[] args) {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분");
		InputView inputView = new InputView();
		String name = inputView.inputCarName();
		System.out.println("시도를 회수는 몇회인가요?");
		CarGame carGame = new CarGame(name);
		int repeatNum = inputView.inputRepeatNum();
		carGame.start(repeatNum);

		carGame.printWinner();
	}
}
