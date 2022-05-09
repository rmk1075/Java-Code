package main.string;

import java.io.UnsupportedEncodingException;

/**
 * String 클래스
 * 
 * String 클래스는 문자열을 다루는 클래스이다.
 * String 객체는 문자열을 저장하기 위해서 문자열 배열 변수인 byte[] value 를 인스턴스 변수로 정의해놓고 있다.
 * 인스턴스 생성시에 생성자의 매개변수로 받은 문자열이 value 변수에 문자형 배열로 저장한다.
 */
public class StringEx {
    /**
     * String 생성
     * 
     * 문자열 생성 방법에는 문자열 리터럴을 지정하는 방법과 String 클래스 생성자를 사용하는 방법 두가지가 있다.
     * 생성자를 사용하는 방법은 new 키워드를 사용하기 때문에 메모리 할당이 이루어져서 항상 새로운 인스턴스가 생성된다.
     * 그러나 문자열 리터럴은 이미 해당 리터럴이 존재하는 경우 존재하는 리터럴을 참조하여 사용할 수 있다.
     */
    public void createString() {
        String s1 = "hello";
        String s2 = "hello"; // s1 에서 사용한 문자열 리터럴과 동일한 리터럴을 참조한다.
        String s3 = new String("hello");
        String s4 = new String("hello"); // s3 과 값은 같지만 다른 인스턴스를 참조한다.

        // String 객체들의 값은 모두 동일하기 때문에 true 가 반환된다.
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true

        // s1 과 s2 는 동일한 문자열 리터럴을 참조하기 때문에 true 를 반환하지만 s3, s4 는 new 를 통해서 새로운 인스턴스를 생성하기 때문에 false 가 반환된다.
        System.out.println(s1 == s2); // true
        System.out.println(s2 == s3); // false
        System.out.println(s3 == s4); // false
    }

    /**
     * 문자열 리터럴
     * 
     * 자바 소스파일에 포함된 모든 문자열 리터럴은 컴파일 시에 클래스 파일에 저장된다.
     * 이때 같은 내용의 문자열 리터럴은 한번만 저장되고, 해당 리터럴을 다른 변수들이 공유한다.
     * 클래스 파일에는 소스파일에 포함된 모든 리터럴 목록이 있다.
     * 해당 클래스 파일이 클래스 로더에 의해 메모리에 올라갈 때, 리터럴 목록에 있는 리터럴들이 JVM 내의 상수 저장소 (constant pool) 에 저장된다.
     */
    public void stringLiteral() {
        // 세 객체 모두 같은 리터럴을 참조한다.
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hello";
    }

    /**
     * immutable
     * 
     * String 은 immutable 성질을 가지고 있다. 이는 값을 변경할 수 없다는 의미이다.
     * 한번 생성된 String 인스턴스는 value 에 저장된 값을 읽어올 수만 있고 변경할 수 없다.
     * 만약 값이 변경되는 경우 기존의 value 가 수정되는 것이 아니라 새로운 문자열을 가진 String 인스턴스를 생성한다.
     * 그렇기 때문에 수정이 빈번하게 일어나는 경우에는 StringBuffer 나 StringBuilder 와 같은 객체를 사용하는 것을 고려해보아야한다.
     */
    public void immutableString() {
        String str = "hello";
        str = str.substring(0, str.length() - 1); // 기존에 참조하던 객체의 값을 변경하는 것이 아니라 "hell" 이라는 새로운 문자열이 생성된다.
    }

    /**
     * encoding
     * 
     * getBytes(String charsetName) 을 사용하면 문자열의 문자 인코딩을 다른 인코딩으로 변경할 수 있다.
     */
    public void stringEncoding() {
        try {
            String str = "가";
            byte[] utf8_str = str.getBytes("UTF-8"); // 문자열을 UTF-8 로 변환
            String str_str = new String(utf8_str, "UTF-8"); // byte 배열을 문자열로 변환 - String(byte[] bytes, String charsetName)
        } catch(UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
