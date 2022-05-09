package main.members;

/**
 * wrapper 클래스
 * 
 * 자바에서 8개의 기본형 타입 (primitive type) 은 객체로 다뤄지지 않는다.
 * 그러나 이러한 타입들도 객체로 다뤄져야 하는 경우가 있는데, 이때 사용되는 것이 wrapper 클래스이다.
 * 8개의 기본형 타입에 대해 각각 8개의 wrapper 클래스들이 있는데, 이들을 통해서 기본형 값들을 객체로 다룰 수 있다.
 */
public class WrapperType {
    /**
     * primitive type - wrapper class
     * 
     * boolean - Boolean
     * char - Character
     * byte - Byte
     * short - Short
     * int - Integer
     * long - Long
     * float - Float
     * double - Double
     */
    public void createWrapperInstances() {
        boolean boolVal = true;
        char chVal = 'a';
        byte byteVal = 1;
        short shortVal = 2;
        int intVal = 3;
        long longVal = 4L;
        float floatVal = 1.0f;
        double doubleVal = 2.0;
        
        // 기본형 타입들을 wrapper 클래스 타입으로 변환
        Boolean boolWrapperVal = Boolean.valueOf(boolVal);
        Character chWrapperVal = Character.valueOf(chVal);
        Byte byteWrapperVal = Byte.valueOf(byteVal);
        Short shortWrapperVal = Short.valueOf(shortVal);
        Integer intWrapperVal = Integer.valueOf(intVal);
        Long longWrapperVal = Long.valueOf(longVal);
        Float floatWrapperVal = Float.valueOf(floatVal);
        Double doubleWrapperVal = Double.valueOf(doubleVal);
    }

    /**
     * autoboxing & unboxing
     * 
     * JDK1.5 이전에는 기본형과 참조형 사이에 연산을 하기 위해서는 wrapper 클래스로 변환하여 객체로 만들어주어야 했다.
     * 그러나 이제는 컴파일러에서 자동으로 변환하는 코드를 넣어주어서 타입을 맞춰준다.
     * 
     * 이렇게 기본형 값을 wrapper 클래스 객체로 자동 형변환 해주는 것을 autoboxing, 반대로 변환하는 것을 unboxing 이라고 한다.
     */
    public void boxing() {
        int a = 10;
        Integer b = Integer.valueOf(100);

        // unboxing: Integer -> int 로 unboxing 된다. 컴파일러에서는 intValue() 를 호출하여 Integer 에서 int 값으로 변환하는 'int sum = a + b.intValue();' 의 코드로 변형된다.
        int sumUnboxing = a + b; // 110 

        // autoboxing: int -> Integer 로 autoboxing 된다. 컴파일 시에는 int a 가 Integer 로 형변환되어 연산되도록 된다.
        Integer sumAutoboxing = a + b; // 110
    }
}
