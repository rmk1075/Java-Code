package main.oop.encapsulation.datahiding;

public class SamePackage {
    public void accessFromSamePackage() {
        Encapsulation encapsulation = new Encapsulation();

        // 같은 패키지 내부에서는 public, protected, default 접근제어자 타입의 멤버에 접근할 수 있다.
        System.out.println(encapsulation.publicStr);
        System.out.println(encapsulation.protectedStr);
        System.out.println(encapsulation.defaultStr);

        // private 멤버에는 직접 접근하지 못하고 getter 를 사용하여 값을 가져올 수 있다.
        // System.out.println(target.privateStr);
        System.out.println(encapsulation.getPrivateStr());
    }
}
