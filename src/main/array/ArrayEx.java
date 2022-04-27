package main.array;

import java.util.Arrays;

public class ArrayEx {
    /**
     * 배열 선언 및 초기화
     * 
     * 배열은 타입과 대괄호를 통해 선언한다.
     * '타입[] 배열이름' 또는 '타입 배열이름[]' 의 형태로 선언한다.
     * 
     * 배열은 new 키워드를 사용하여 할당할 길이만큼의 배열을 생성할 수 있다.
     * 생성한 배열의 인덱스를 사용하여 각 요소에 접근하고 값을 저장할 수 있다.
     * 배열 선언시에는 new 키워드를 사용하지 않고 직접 배열 요소들을 지정하여 배열을 초기화할 수 있다.
     */
    public void defineArray() {
        int[] arr1 = new int[5];
        for(int i = 0; i < 5; i++) arr1[i] = i + 1;

        int arr2[] = new int[5];
        for(int i = 0; i < 5; i++) arr2[i] = i + 1;

        int[] arr3 = {1, 2, 3, 4, 5};
    }

    /**
     * 배열 복사
     * 
     * 배열의 복사는 얕은 복사와 깊은 복사가 있다.
     * 얕은 복사의 경우 주소값만 복사하여 원본과 동일한 공간의 배열을 참조하는 것이다.
     * 이러한 경우에 복사본에서 값을 변경하면 원본도 같이 변경이 된다.
     * 이와 반대로 깊은 복사는 새로운 공간에 원본의 값을 복사한 것으로 원본과는 직접적인 관계가 없게된다.
     * 
     * 깊은 복사는 배열을 만들고 반복문으로 값을 넣을 수도 있지만, 예제에서는 Arrays 에서 제공해주는 메서드를 사용하였다.
     */
    public void copyArray() {
        int[] origin = {1, 2, 3, 4, 5};
        int[] copy1 = origin; // 얕은 복사
        int[] copy2 = Arrays.copyOf(origin, origin.length); // 깊은 복사

        for(int i = 0; i < 5; i++) {
            copy1[i]++;
            copy2[i]--;
        }

        // copy1 에서 변경한 값이 origin 도 동일하게 적용되어 있다. 반면에 copy2 는 나머지와 값이 아예 다르다.
        for(int i = 0; i < 5; i++) {
            System.out.printf("%d %d %d\n", origin[i], copy1[i], copy2[i]);
        }
    }
}
