package main.conditionalsAndIteratives;

public class Conditionals {
    /**
     * if 문
     * 
     * if 문은 조건식과 내용 (괄호) 로 이루어져 있다.
     * 조건식이 참인 경우 괄호 안의 문장들을 수행한다.
     */
    public void ifStatement() {
        boolean condition = true;
        if(condition) {
            System.out.println("condition is true");
        }

        // if 문 블럭의 실행할 문장이 하나만 있다면 블럭 괄호를 생략할 수 있다.
        if(condition) System.out.println("condition is true");
    }

    /**
     * if-else 문
     * 
     * if 문에 else 를 추가하여 예외처리를 하거나, else if 문을 추가하여 조건을 추가할 수 있다.
     */
    public void ifElseStatement() {
        int score = 80;
        if(90 <= score) System.out.println("A");
        else if(80 <= score) System.out.println("B");
        else if(70 <= score) System.out.println("C");
        else if(60 <= score) System.out.println("D");
        else System.out.println("F");
    }

    /**
     * switch 문
     * 
     * switch 와 case 를 사용하여 하나의 조건 식에 대한 여러 경우의 수를 간결하게 구현할 수 있다.
     * 경우의 수가 많은 경우에 모든 조건을 if-else 로 구현하는 것보다 유리하다.
     * 
     * case 문의 값은 중복되면 안된다. 중복되는 경우 어떤 case 문을 실행해야할지 알 수 없기 때문에 중복을 허용하지 않는다.
     * 각 case 문 다음에는 break 를 주어서 switch 문을 탈출해야 한다. 그렇지 않으면 다음 case 문이 수행되게 된다.
     */
    public void switchCaseStatement() {
        char grade = 'A';
        switch(grade) {
            case 'A':
                System.out.println("90 ~ 100");
                break;
            case 'B':
                System.out.println("80 ~ 89");
                break;
            case 'C':
                System.out.println("70 ~ 79");
                break;
            case 'D':
                System.out.println("60 ~ 69");
                break;
            case 'F':
                System.out.println("0 ~ 59");
                break;
        }
    }
}
