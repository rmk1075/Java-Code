package main.oop.polymorphism;

/**
 * Polymorphism
 * 
 * 다형성은 여러가지 형태를 가질 수 있는 능력을 의미한다.
 * 자바에서는 특정 타입의 참조변수가 여러 타입의 객체를 참조할 수 있다. 이를 통해 다형성을 프로그램적으로 구현하였다.
 * 이 말은 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조할 수 있도록 하였다는 것이다.
 */
public class Polymorphism {
    public void polymorphismEx() {
        Animal animal = new Animal("animal", 1);
        
        // 조상 타입의 참조변수는 다양한 자손 객체를 참조할 수 있다.
        animal = new Dog("dog", 2);
        animal = new Cat("cat", 2);

        // 반대로 자손 타입 참조변수가 조상 객체를 참조할 수 없다.
        // Dog animalToDog = new Animal("animal", 3);
    }

    /**
     * 상속 관계에서의 형변환
     * 
     * 상속관계에 있는 객체들 간에는 형변환을 사용할 수 있다.
     * 하지만 조상 -> 자손 타입으로의 형변환은 불가능하다.
     * 그 이유는 자손 타입은 조상 타입보다 더 많은 멤버를 가지고 있기 때문이다.
     * 그렇기 때문에 조상 -> 자손으로 형변환을 하게되면 기존에 조상 타입의 객체에는 없는 멤버들이 추가되어야 하는데, 이는 불가능하기 때문에 형변환이 불가능하다.
     */
    public void castingEx() {
        Animal animal = new Animal("animal", 1);
        System.out.printf("animal is instance of Animal : %s\n", animal instanceof Animal);
        System.out.printf("animal is instance of Dog : %s\n", animal instanceof Dog);

        animal = new Dog("dog", 1); // up-casting: 조상 타입의 참조변수는 자손 타입의 객체를 명시적 형변환 없이 참조할 수 있다.
        System.out.printf("animal is instance of Animal : %s\n", animal instanceof Animal);
        System.out.printf("animal is instance of Dog : %s\n", animal instanceof Dog);

        // down-casting: 자손 타입의 참조변수가 조상 타입의 객체를 참조할 때는 명시적으로 형변환 해주어야 한다.
        // Dog dog = (Dog) new Animal("animal", 2); // 조상 타입을 자손 타입으로 형변환하는 경우 자손 타입의 멤버가 조상보다 더 많기 때문에 자손이 조상에 포함될 수 없어서 런타임 에러가 발생한다.
        Dog dog = (Dog) animal; // animal 은 Animal 타입이지만 실제로 참조하고 있는 객체가 Dog 타입이기 때문에 형변환이 유효하다.
        System.out.printf("dog is instance of Animal : %s\n", dog instanceof Animal);
        System.out.printf("dog is instance of Dog : %s\n", dog instanceof Dog);

        // Cat cat = (Cat) new Dog("cat", 2); // 같은 조상을 상속받은 타입간에는 형변환을 사용하여 참조할 수 없다. 같은 조상을 상속받지만 둘 사이는 상속관계가 아니기 때문에 직접적인 형변환은 허용되지 않는다.
    }

    public Animal[] polymorphismArray() {
        // 다형성을 통해서 부모 타입의 배열에 서로 다른 자손 타입의 객체들을 저장할 수 있다.
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("dog", 1);
        animals[1] = new Cat("cat", 1);
        return animals;
    }
}

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
}

class  Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
}