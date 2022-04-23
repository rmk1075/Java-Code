package main.variables;

/**
 * Variable (변수)
 * 
 * 변수는 값을 저장하는 메모리 상의 공간을 의미한다.
 * 이 공간에 저장되는 값은 변경할 수 있기 때문에 변수라는 이름으로 사용한다.
 * 하나의 변수에는 하나의 값만 저장할 수 있으며, 값이 변경되면 기존의 값은 사라지게 된다.
 */
public class Variables {
    /**
     * Variable
     * 
     * 변수는 {변수 타입} {변수 이름} 의 형식으로 코드를 작성하여 선언할 수 있다.
     * 변수의 타입은 해당 변수에 저장되는 값이 어떤 타입인지를 지정하는 것이다.
     * 변수가 선언되면 메모리에 변수 타입에 맞는 크기가 해당 변수에 할당되어 변수의 이름을 통해 사용할 수 있게된다.
     */
    public void defineVariables() {
        int number; // number 라는 변수를 선언한다.

        // number 의 값이 초기화되지 않았기 때문에 number 를 사용하려고 하면 오류가 발생한다.
        // System.out.println(number);

        number = 0; // number 의 값을 0으로 초기화 해주었다.
        System.out.println(number); // 0
    }

    /**
     * Constant (상수)
     * 
     * 상수는 변수와 같이 값을 저장하는 공간이지만, 한번 값을 저장하면 다른 값으로 변경할 수 없다.
     * 상수는 변수와 동일하게 타입과 이름을 기술하고 앞에 final 이라는 키워드를 붙여주어 선언한다.
     */
    public void defineConstances() {
        final int INT_CONSTANT = 0;
        System.out.println(INT_CONSTANT); // 0

        // 한번 값이 정의된 상수의 값을 변경하려고 하면 오류가 발생한다.
        // INT_CONSTANT = 10;
    }
}
