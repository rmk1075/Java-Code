package main.classAndInstance;

import java.util.Arrays;

/**
 * Instance
 * 
 * 인스턴스는 클래스를 생성하여 만든 객체를 의미한다.
 * 객체와 동일한 의미이지만 보통 객체는 인스턴스의 개념을 의미하는 포괄적인 의미로 사용되며,
 * 인스턴스는 클래스를 사용하여 생성된 특정 객체를 지칭하는 말로 쓰인다.
 */
public class PlayerInstance {
    public void createPlayerInstance() {
        // Player 인스턴스를 참조할 참조변수 선언
        Player player;

        // Player 인스턴스를 생성하여 주소를 참조변수에 저장
        player = new Player("cr", 7);

        // 인스턴스의 메서드를 사용하여 이름과 나이를 출력한다.
        System.out.println(player.getName());
        System.out.println(player.getNumber());
    }

    public void instanceArray() {
        // 객체 배열을 만들어서 인스턴스들을 저장한다.
        Player[] players = new Player[5];
        players[0] = new Player("cr", 7);
        players[1] = new Player("messi", 10);
        players[2] = new Player("sergio", 4);
        players[3] = new Player("rafael", 5);
        players[4] = new Player("carvajal", 2);

        Arrays.stream(players).forEach(
            p -> System.out.printf("player info: name=%s backnumber=%d\n", p.getName(), p.getNumber()));
    }
}
