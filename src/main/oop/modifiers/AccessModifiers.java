package main.oop.modifiers;

/**
 * access modifiers
 * 
 * 접근 제어자는 public, protected, default, private 의 4가지가 존재한다.
 * - public: 해당 리소스에 대한 접근에 제한이 없다.
 * - protected: 같은 패키지 내부, 다른 패키지에서 해당 클래스를 상속한 자손 클래스에서 접근이 가능하다.
 * - default: 같은 패키지 내무에서만 접근이 가능하다.
 * - private: 같은 클래스 내부에서만 접근이 가능하다.
 */
public class AccessModifiers {
    public int publicVar = 0;
    protected int protectedVar = 1;
    int defaultVar = 2; // default 제어자는 명시적으로 default 를 붙이지 않는다.
    private int privateVar = 3;

    public void publicMethod() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }

    /**
     * 접근 제어자를 사용하면 해당 객체 내부의 데이터를 특정 영역 외부에서 볼 수 없도록 숨길 수 있다.
     * 데이터가 유효한 값을 유지하고 외부에서 함부로 접근할 수 없도록 제어하는 것을 data hiding 이라고 하며,
     * 객체지향 개념에서 캡슐화, encapsulation 이라고 한다.
     * 
     * 캡슐화가 적용된 클래스에서 public 메서드인 getter, setter 메서드 들을 통해서 간접적으로 해당 영역에 접근할 수 있도록 경로를 열어줄 수 있다.
     * 이 방법을 통해서 직접적으로 접근하는 것이 아니라 간접적으로 접근하도록 하여 메서드에서 특정 예외에 대해 처리할 수도 있다.
     * 
     * @return
     */
    public int getPrivateVar() {
        return privateVar;
    }
}

class SamePackageClass {
    public void accessToVar() {
        AccessModifiers am = new AccessModifiers();
        System.out.println(am.publicVar);
        System.out.println(am.protectedVar);
        System.out.println(am.defaultVar);
        // System.out.println(am.privateVar); // private 변수는 외부 클래스에서 접근할 수 없다.
        System.out.println(am.getPrivateVar()); // getter 를 통해서 값을 읽어올 수 있다.
    }
}