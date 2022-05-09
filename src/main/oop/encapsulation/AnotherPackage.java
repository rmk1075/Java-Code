package main.oop.encapsulation;

import main.oop.encapsulation.datahiding.Encapsulation;

public class AnotherPackage {
    public void accessFromAnotherPackage() {
        Encapsulation encapsulation = new Encapsulation();
    
        // 다른 패키지 내부에서는 public 접근제어자 타입의 멤버만 접근할 수 있다.
        System.out.println(encapsulation.publicStr);
        // System.out.println(encapsulation.protectedStr);
        // System.out.println(encapsulation.defaultStr);

        // private 멤버에는 직접 접근하지 못하고 getter 를 사용하여 값을 가져올 수 있다.
        // System.out.println(target.privateStr);
        System.out.println(encapsulation.getPrivateStr());
    }
}

class AnotherPackageInheritTheClass extends Encapsulation {
    public void accessFromAnotherPackage() {
        AnotherPackageInheritTheClass inheritedEncapsulation = new AnotherPackageInheritTheClass();
    
        // 다른 패키지 내부이지만 자식클래스인 경우에는  public 과 protected 접근제어자 타입의 멤버에 접근할 수 있다.
        System.out.println(inheritedEncapsulation.publicStr);
        System.out.println(inheritedEncapsulation.protectedStr);
        // System.out.println(encapsulation.defaultStr);

        // private 멤버에는 직접 접근하지 못하고 getter 를 사용하여 값을 가져올 수 있다.
        // System.out.println(target.privateStr);
        System.out.println(inheritedEncapsulation.getPrivateStr());
    }
}