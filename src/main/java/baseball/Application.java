package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");
        while (true) {

            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String userInput = readLine();
            if (userInput.equals("1")) { // 1이면 게임 다시
                continue;
            } else if (userInput.equals("2")) { // 2이면 게임 종료
                break;
            }
        }
    }
}
