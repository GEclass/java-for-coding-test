package yelim.search;

import java.util.*;

public class Search_EX7_2 { // 재귀함수로 구현한 이진 탐색
    // 탐색할 배열, 찾을 값, 시작 값, 끝 값
    // 정렬된 배열을 넣어야 된다.
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) return -1;

        // 이진 탐색을 위한 배열의 중간 값
        int mid = (start + end) / 2;

        // 중간 값이 찾을 값이면 중간점 인덱스 반환
        if (arr[mid] == target) return mid;

        // 중간 값보다 찾을 값이 작은 경우 중간 값의 왼쪽 배열(start ~ (mid - 1))을 재귀함수로 이진 탐색하기
        else if (arr[mid] > target) return binarySearch(arr, target, start, mid - 1);

        // 중간 값보다 찾을 값이 큰 경우 중간 값의 오른쪽 배열((mid + 1) ~ end)을 재귀함수로 이진 탐색하기
        else return binarySearch(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 원소의 개수
        int n = sc.nextInt();

        // 찾을 값
        int target = sc.nextInt();

        // 전체 원소 입력받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 이진 탐색 수행 결과 출력
        int result = binarySearch(arr, target, 0, n - 1);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        }
        else {
            System.out.println(result + 1);
        }
    }
}
