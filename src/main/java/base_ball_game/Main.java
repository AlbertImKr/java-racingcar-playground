package base_ball_game;

public class Main {
	public static void main(String[] args) {
		InputView inputView = new InputView();
		String name = inputView.inputName();
		int inputRepeatNum = inputView.inputRepeatNum();
		CarGame carGame = new CarGame(name, inputRepeatNum);
		carGame.start();
		carGame.getWinner();
	}
}
