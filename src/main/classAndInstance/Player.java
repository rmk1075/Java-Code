package main.classAndInstance;

/**
 * Class
 * 
 * 클래스는 객체를 정의해놓은 것이다. 객체의 설계도라고 이해하면 된다.
 * 클래스에 객체를 정의해놓고, 이 클래스를 사용하여 실제 사용할 객체를 생성한다.
 * 
 * 객체에 포함되어 있는 속성과 기능들은 객체의 멤버라고 한다.
 * 멤버에 정의된 속성은 보통 멤버 변수라고 하며, 기능들은 메서드라고 한다.
 */
public class Player {
    // Player 객체의 멤버 변수
    public String name;
    public int number;

    // Player 클래스의 생성자
    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // Player 클래스의 메서드
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
