package main.conditionalsAndIteratives;

public class Iteratives {
    static int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    /**
     * for 문
     * 
     * for 문은 초기화, 조건식, 증감식과 블럭으로 구성되어 있다.
     * for 문이 실행되면 초기화가 실행되고, 조건식이 참인 동안 계속해서 블럭안의 코드를 수행한다.
     * 블럭의 코드가 한번 수행될 때 마다 증감식을 수행한다.
     */
    public void forStatement() {
        // for(초기화; 조건식; 증감식)
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    /**
     * for-each 문
     * 
     * JDK 1.5 부터 for-each 문이 추가되어 좀 더 편리하게 loop 문을 수행할 수 있게되었다.
     * for-each 문을 사용하면 배열이나 컬렉션의 요소를 하나씩 순서대로 사용할 수 있다.
     */
    public void forEachStatement() {
        for(int num : nums) {
            System.out.println(num);
        }
    }

    /**
     * while 문
     * 
     * while 문은 조건식과 블럭으로 구성되어 있다. 조건식이 참인 동안 블럭의 코드를 수행한다.
     */
    public void whileStatement() {
        int i = 0;
        while(i < nums.length) {
            System.out.println(nums[i]);
            i++;
        }
    }

    /**
     * do-while 문
     * 
     * do-while 문은 while 문과 달리 블럭을 한번 수행한 후에 조건을 확인한다.
     * 블럭 실행과 조건 확인의 순서를 바꿔놓은 것으로 이해하면 된다.
     * 
     * 무조건 블럭 코드를 한번 수행하려고 할 때 사용하면 된다.
     */
    public void doWhileStatement() {
        int i = 0;
        do {
            System.out.println(nums[i]);
            i++;
        } while(i < nums.length);
    }
    
    /**
     * break, continue, loop name
     * 
     * 반복문에 조건식 등을 추가하여서 break, continue 등을 사용할 수 있다.
     * 이들은 각각 가장 가까운 반복문에서 탈출하거나 반복문의 나머지 부분을 건너뛰는 역할을 한다.
     * 
     * break, continue 를 사용할 때 반복문의 이름을 줄 수 있다.
     * 반복문에 이름을 지정하고 이를 break, continue 에 사용하면, 해당 반복문에 대해서 break, continue 를 수행한다.
     */
    public void breakContinueLoop() {
        for(int num : nums) {
            // 5 까지의 숫자만 출력한다.
            if(5 < num) break;
            System.out.println(num);
        }

        for(int num : nums) {
            // 짝수인 경우에는 출력하지 않는다.
            if(num % 2 == 0) continue;
            System.out.println(num);
        }

        loop: for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                // 두 수의 곱이 50 보다 큰 경우 출력하지 않고 다음으로 넘어간다.
                // 이때 안쪽 for 문이 아닌 loop 라는 이름이 붙은 바깥 for 문의 마지막으로 넘어간다.
                if(50 < i * j) continue loop;
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
