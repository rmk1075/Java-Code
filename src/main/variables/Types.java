package main.variables;

/**
 * Data Types
 * 
 * 자바의 데이터 타입은 크게 실제 값을 저장하는 기본형과 메모리 공간의 주소를 저장하는 참조형으로 나눌 수 있다.
 */
public class Types {
    /**
     * primitive type
     * 
     * 실제 값을 저장하는 타입으로 논리형, 정수형, 실수형 등의 타입들이 속해져 있다.
     * 자바는 총 8개의 기본 타입을 제공한다. (boolean, char, byte, short, int, long, float, double)
     */
    public void primitiveTypes() {
        // primitive types

        // boolean type
        boolean boolVal = true; // 1 byte (false / true)

        // char type
        char charVal = 'a'; // 2 byte ('\u0000' ~ '\uffff', 0 ~ 65535)

        // integer types: byte, short, int, long
        byte byteVal = 0; // 1 byte (-128 ~ 127)
        short shortVal = 0; // 2 byte (-32,768 ~ 32,767)
        int intVal = 0; // 4 byte (-2,147,483,648 ~ 2,157,483,647)
        long longVal = 0L; // 8 byte (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)

        // float types: float, double
        float floatVal = 0.0f; // 4 byte (1.4E-45 ~ 3.4E38)
        double doubleVal = 0.0d; // 8 byte (4.9E-324 ~ 1.8E308)
    }

    
    /**
     * reference type
     * 
     * 참조형은 기본 타입이 아닌 새로운 타입이 되는 클래스의 이름을 사용하여 선언한다.
     * 그렇기 때문에 새로운 클래스를 작성하는 것은 새로운 참조형 타입을 추가하는 것이다.
     */
    class Reference {}

    public void referenceTypes() {
        // reference type

        Reference referenceVaribale = new Reference(); // Reference 타입의 객체를 참조하는 참조형 변수를 선언하고 초기화 하였다.
        System.out.println(referenceVaribale); // main.variables.Types$Reference@7344699f 과 같이 기본형의 값이 아닌 메모리 주소 값이 출력된다.
    }
}
