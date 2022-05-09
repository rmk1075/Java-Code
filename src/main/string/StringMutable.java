package main.string;

/**
 * StringBuffer, StringBuilder
 * 
 * String 객체는 immutable 이기 때문에 값을 변경할 수 없다.
 * 값을 변경하는 경우 매번 새로운 객체를 생성한다.
 * 
 * 반면에 StringBuffer, StringBuilder 는 String 과 동일하게 CharSequence 를 다루지만 변경이 가능하다.
 * 내부적으로 문자열 편집을 위한 버퍼를 가지고 있으며, 인스턴스를 생성할 때 버퍼의 크기를 지정할 수 있다.
 * 만약에 문자열의 크기가 버퍼를 넘어가면 버퍼의 크기를 자동으로 늘려준다.
 * 
 * - StringBuffer 와 StringBuilder 차이
 * 
 * StringBuffer 와 StringBuilder 의 차이는 멀티쓰레드에서 동기화 지원여부에 있다.
 * StringBuffer 는 멀티쓰레드에서 안전하도록 동기화되어있다.
 * 코드를 보면 StringBuffer 는 synchronized 키워드를 통해서 동기화를 지원하도록 메서드들이 구현되어 있는 반면,
 * StringBuilder 는 synchronized 키워드가 붙어있지 않다.
 * 
 * 동기화를 지원하는 경우 프로그램에서 성능은 떨어질 수 밖에 없다. 그렇기 때문에 둘을 비교하면 StringBuilder 의 성능이 약간 우세하다.
 * 그렇기 때문에 멀티쓰레드 환경이 아닌 경우에는 StringBuilder 를 사용하면 된다.
 * 
 * 그 외의 메서드들은 생성자를 제외하고 모두 동일하다.
 */
public class StringMutable {
    public void mutableStringObjects() {
        StringBuffer sbuffer = new StringBuffer("abc");
        System.out.println(sbuffer.toString());

        sbuffer.append("def").append("ghi"); // StringBuffer 객체는 append() 메서드를 통해서 값을 추가할 수 있다. 그리고 appen() 는 해당 인스턴스의 주소를 반환하기 때문에 추가적인 메서드들을 chaining 하여 사용할 수 있다.

        StringBuilder sbuilder = new StringBuilder("abc");
        System.out.println(sbuilder.toString());

        sbuilder.append("def").append("ghi"); // StringBuilder 또한 append() 메서드를 통해서 값을 추가할 수 있다.
    }   
}
