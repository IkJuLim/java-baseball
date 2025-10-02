package baseball.view;

public class OutputView {

    private static final String BALL_MSG = "볼";
    private static final String STRIKE_MSG = "스트라이크";
    private static final String NOTHING = "낫싱";
    private static final String SUCCESS_MSG = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final int SUCCESS_STRIKE_SCORE = 3;

    public void printBallStrikeMessage(int ballScore, int strikeScore) {
        if (ballScore == 0 && strikeScore == 0) {
            System.out.print(NOTHING);
        }
        if (ballScore > 0) {
            System.out.printf("%d%s ", ballScore, BALL_MSG);
        }
        if (strikeScore > 0) {
            System.out.printf("%d%s", strikeScore, STRIKE_MSG);
        }
        System.out.println();
        if(strikeScore == SUCCESS_STRIKE_SCORE){
            System.out.println(SUCCESS_MSG);
        }
    }
}
