package main.exceptions;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Execption
 * 
 * 프로그램 오류는 특정한 원인으로 프로그램이 오작동하거나 비정상적으로 종료되는 경우를 말한다.
 * 개발자의 프로그래밍 로직이 잘못되는 논리적 에러를 제외하면 에러는 발생 시점에 따라 '컴파일 에러' 와 '런타임 에러' 로 나뉜다.
 * 
 * 컴파일 에러는 프로그램이 실행되기 전에 컴파일 단계에서 컴파일러를 통해서 잡을 수 있는 오류이다.
 * 반면에 런타임 에러는 프로그램 실행 중에 발생하는 오류로 실행되기 전에는 알 수 없는 오류이다.
 * 이러한 런타임 에러를 방지하기 위해서 실행 도중 발생할 수 있는 모든 경우의 수를 고려하여 대비해야한다.
 * 
 * 자바에서는 런타임에 발생할 수 있는 프로그램 오류를 에러 (Error) 와 예외 (Exception) 으로 구분한다.
 * 에러는 메모리 부족이나 스택 오버플로우와 같이 복구할 수 없는 오류이고, 예외는 발생하더라도 수습하여 복구할 수 있는 오류이다.
 * 에러 발생시에는 프로그램의 비정상적 종료를 막을 수 없지만, 예외는 이에 대한 처리 코드를 미리 작성하여 대비할 수 있다.
 * 
 * 자바에서는 예외와 에러를 처리하는 Error 와 Exception 클래스가 있는데 이들은 모두 Throwable 클래스를 상속한다.
 */
public class ExceptionEx {
    public void exceptionEx() {
        /**
         * try-catch 문
         * 
         * try-catch 문은 자바에서 예외처리를 위해 사용하는 문법이다.
         * try 문 안에서 예외가 발생하면 해당 예외에 일치하는 catch 블럭을 찾는다.
         * catch 문에 해당하는 예외에 대한 처리문이 있는 경우 catch 블럭의 코드를 수행한 후에 다음 코드로 넘어간다.
         * 만약 일치하는 예외가 없는 경우에는 예외가 처리되지 않는다.
         * 
         * 만약 예외가 발생하지 않는 경우 try-catch 문을 빠져나와 수행을 계속한다.
         */
        try {
            // 예외가 발생할 수 있는 코드가 위치한다.

            // throw 키워드를 사용하여 exception 을 발생시킬 수 있다.
            throw new RuntimeException();
        } catch (RuntimeException e) {
            // RuntimeException 발생 시에 처리되는 catch 문
            e.printStackTrace(); // 예외 발생 당시의 호출 스택 (call stack) 에 있는 메서드의 정보와 예외 메시지를 출력한다.
            e.getMessage(); // 발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
        } finally {
            // 예외의 발생 여부에 상관없이 항상 수행되는 코드이다.
        }
    }

    /**
     * throws
     * 
     * throws 키워드를 통해서 메서드에서 발생할 수 있는 예외를 미리 선언할 수 있다.
     * 이를 통해서 해당 메서드를 사용할 떄 처리해야할 예외를 미리 명시적으로 기술할 수 있다.
     * 자바는 이러한 방식으로 통해서 개발자가 해당 메서드를 사용할 때 예외처리를 해주도록 강제하고 있다.
     * 
     * @throws RuntimeException
     */
    public void throwsEx() throws RuntimeException {

    }

    public void tryWithResoutces() {
        /**
         * try-with-resources 문
         * 
         * try-with-resoures 문은 try-catch 문에서 자원을 사용하고 자동으로 반환하도록 할 때 사용한다.
         * try 문에서 괄호안에 사용할 자원을 선언하면 해당 자원은 close() 를 호출하지 않아도 try-catch 문을 탈출할 때 자동으로 반환된다.
         */
        try (FileInputStream fis = new FileInputStream("input.dat")) {
            DataInputStream dis = new DataInputStream(fis);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
