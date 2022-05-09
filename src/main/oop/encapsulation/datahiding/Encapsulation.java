package main.oop.encapsulation.datahiding;

/**
 * Encapsulation
 * 
 * 접근 제어자를 사용하면 해당 객체 내부의 데이터를 특정 영역 외부에서 볼 수 없도록 숨길 수 있다.
 * 데이터가 유효한 값을 유지하고 외부에서 함부로 접근할 수 없도록 제어하는 것을 data hiding 이라고 하며,
 * 객체지향 개념에서 캡슐화, encapsulation 이라고 한다.
 * 
 * 캡슐화가 적용된 클래스에서 public 메서드인 getter, setter 메서드 들을 통해서 간접적으로 해당 영역에 접근할 수 있도록 경로를 열어줄 수 있다.
 * 이 방법을 통해서 직접적으로 접근하는 것이 아니라 간접적으로 접근하도록 하여 메서드에서 특정 예외에 대해 처리할 수도 있다.
 * 
 * @return
 */
public class Encapsulation {
    // 접근제어자에 대한 설명은 main.oop.Modifiers 의 access modifiers 부분을 참고하면된다.
    public String publicStr = "public string";
    protected String protectedStr = "protected string";
    String defaultStr = "default string";
    private String privateStr  = "private string";

    /**
     * getter setter
     * @return
     * 
     * 자바에서는 encapsulation 가 적용된 멤버에 getter, setter 메서드를 사용하여 간접적으로 접근할 수 있도록 해두었다.
     * 이 방법을 통해서 해당 영역에 접근하는 특정 경우들에 대한 예외처리를 할 수 있다.
     */
    public String getPrivateStr() {
        return this.privateStr;
    }

    public void setPrivateStr(String privateStr) {
		this.privateStr = privateStr;
	}

    public void accessFromSameClass() {
        Encapsulation encapsulation = new Encapsulation();

        // 같은 클래스에서는 모든 접근제어자 타입의 멤버에 접근할 수 있다.
        System.out.println(encapsulation.publicStr);
        System.out.println(encapsulation.protectedStr);
        System.out.println(encapsulation.defaultStr);
        System.out.println(encapsulation.privateStr);
    }
}