package main.classAndInstance;

/**
 * Overloading
 * 
 * 오버로딩은 하나의 클래스 내부에 같은 이름을 가진 메서드 들을 여러개 정의하는 것을 의미한다.
 * 자바에서는 메서드를 구분할 때, 메서드의 이름뿐만 아니라 매개변수의 개수와 타입 까지도 포함하여 선언부를 비교한다.
 * 그렇기 때문에 단순히 메서드의 이름만 같은 메서드 들을 여러개 정의할 수 있다.
 * 
 * 오버로딩은 메서드의 이름이 같아야 하고, 매개변수의 개수나 타입은 달라야 한다.
 * 많이 사용하는 메서드 중, println() 이 다양한 타입에 대해 값을 출력해주도록 오버라이딩으로 구현되어있다.
 */
public class Overloading {
    public void defaultMethod() {
        System.out.println("method");
    }

    public void defaultMethod(int num) {
        System.out.println("method " + num);
    }

    public void defaultMethod(String str) {
        System.out.println("method " + str);
    }

    public void defaultMethod(int num, String str) {
        System.out.println("method " + num + " " + str);
    }

    /**
     * 가변인자 (variable arguments) 는 함수의 매개변수 개수를 동적으로 지정해주는 기능으로 '타입...변수명' 과 같은 형식으로 선언한다.
     * 가변인자는 매개변 수 중에 가장 마지막에 선언해야한다. 그렇지 않으면 어디까지가 가변인자인지 구분할 수 없기 때문이다.
     */
    public void methodByVargs(String name, int...args) {
        System.out.println("Hello " + name);
        for(int a : args) {
            System.out.println(a);
        }
    }
}
