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
     * char
     * 
     * 문자형 타입인 char 는 문자를 유니코드로 변환하여 정수값으로 저장한다.
     * 그렇기 때문에 문자 리터럴이 아닌 정수값을 사용하여 유니코드를 직접 저장할 수도 있다.
     */
    public void charType() {
        // ch 를 int 로 변환하면 'a' 의 유니코드 값인 97 이 된다.
        char ch = 'a';
        System.out.printf("%c = %d\n", ch, (int)ch); // a = 97

        // 반대로 유니코드 97 을 문자형에 저장하면 문자 'a' 로 변환된다.
        ch = 97;
        System.out.printf("%c = %d\n", ch, (int)ch); // a = 97
    }
    
    /**
     * integer
     * 
     * 정수형 타입으로는 byte, short, int, long 이 있다.
     * 이들은 표현할 수 있는 값의 범위가 다르기 때문에 이 점을 유의하여 사용해야 한다.
     */
    public void intTypes() {
        System.out.println("Bytes, Min value, Max value of integer types.");
        System.out.printf("Byte : BYTES=%d MIN_VALUE=%d MAX_VALUE=%d\n", Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Short : BYTES=%d MIN_VALUE=%d MAX_VALUE=%d\n", Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Integer : BYTES=%d MIN_VALUE=%d MAX_VALUE=%d\n", Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Long : BYTES=%d MIN_VALUE=%d MAX_VALUE=%d\n", Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);

        /**
         * 각 타입이 가지는 값의 범위를 넘어서는 경우를 오버플로우라고 하며, 이때는 의도한 값이 아닌 다른 값으로 저장된다.
         * 정수 타입은 이진수로 값이 저장되는데, 이때 가장 첫번째 비트는 부호비트가 된다.
         * 오버플로우가 발생하는 경우 부호비트가 영향을 받아서 숫자의 부호가 바뀌기도 한다.
         */
        int num = Integer.MAX_VALUE;
        System.out.printf("2147483647 = %d\n", num); // 2147483647

        // overflow 가 발생하여 2147483648 이 아닌 -2147483648 가 저장된다.
        num++;
        System.out.printf("2147483647 + 1 = %d\n", num); // -2147483648

        num = Integer.MIN_VALUE; // -2147483648
        System.out.printf("-2147483648 = %d\n", num); // -2147483648

        // 반대로 최솟값에서 부호가 변경되어 2147483647 으로 값이 바뀐다.
        num--;
        System.out.printf("-2147483648 - 1 = %d\n", num); // 2147483647
    }

    /**
     * float
     * 
     * 실수형 타입으로는 float 와 double 이 존재한다.
     * 각각 4 byte, 8 byte 로 표현할 수 있는 값의 범위가 다르다.
     * 또한 정수와 다르게 부호 (S), 지수 (E), 가수 (M) 세 부분으로 나뉘어진다.
     * S (1 bit) + E (8 bit) + M (23 bit) -> ± M * 10 ^ E 으로 값이 표현된다.
     */
    public void floatTypes() {
        System.out.println("Bytes, Min value, Max value of float types.");
        System.out.printf("Byte : BYTES=%d MIN_VALUE=%f MAX_VALUE=%f\n", Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Byte : BYTES=%d MIN_VALUE=%f MAX_VALUE=%f\n", Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
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
