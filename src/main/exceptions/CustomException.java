package main.exceptions;

/**
 * 사용자정의 예외
 * 
 * 예외 클래스를 상속받아서 새로운 예외에 대한 사용자정의 예외 클래스를 작성할 수 있다.
 * 아래의 클래스는 Exception 클래스를 상속받아서 사용자정의 예외 클래스를 작성한 예제이다.
 */
public class CustomException extends Exception {
    private final int ERR_CODE;

    CustomException(String msg) {
        this(msg, 100);
    }

    CustomException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    public int getErrCode() {
        return ERR_CODE;
    }
}
