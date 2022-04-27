package main.array;

import java.util.Arrays;

public class MultiDimensionArray {
    /**
     * 다차원 배열
     * 
     * 배열은 고차원으로 가는 경우 그 차수만큼 대괄호 쌍을 추가해주어 만들 수 있다.
     * 예제에서는 대괄호 2쌍을 사용하여 2차원 배열을 생성하였다.
     * 5x5 배열을 생성하고 값을 초기화 하였다.
     * 
     * 다차원 배열은 배열의 배열로 구성이 된다.
     * 각 row 가 또다른 다차원 배열의 주소값을 가지게 된다.
     */
    public void create2Darray() {
        int[][] arr = new int[5][5];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                arr[i][j] = i * j;
            }
        }
    }

    /**
     * 가변 배열
     * 
     * 자바에서는 다차원 배열이 여러 배열을 연결하는 형태로 처리하기 때문에 각 열의 길이가 같지 않아도 된다.
     * 이러한 구조로 인해 다차원 배열을 생성할 때 전체 배열 차수 중 마지막 차수의 길이를 지정하지 않고, 추후에 각기 다른 길이의 배열을 생성하도록 할 수 있다.
     */
    public void jaggedArray() {
        // 가변 배열을 선언하여 각 열의 길이를 다르게 생성한 후 초기화 하였다.
        int[][] arr = new int[5][];
        for(int i = 0; i < 5; i++) {
            arr[i] = new int[i + 1];
            Arrays.fill(arr[i], i);
        }

        Arrays.stream(arr).forEach(row -> System.out.println(Arrays.toString(row)));
    }

}
