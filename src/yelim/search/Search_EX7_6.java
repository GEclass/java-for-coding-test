package yelim.search;

import java.util.*;

public class Search_EX7_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 가게의 부품 개수
        // 가게 부품 목록
        int n = sc.nextInt();
        // 집합(Set) 정보를 처리하기 위한 HashSet 라이브러리
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            s.add(x);
        }

        // 손님이 확인 요청한 부품 개수
        // 손님이 확인 요청한 부품 목록
        int m = sc.nextInt();
        int[] targets = new int[n];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        // 손님이 확인 요청한 부품 번호를 하나씩 확인
        for (int i = 0; i < m; i++) {
            // 가게 부품 목록 집합에서 해당 부품이 존재하는지 contains()로 확인
            if (s.contains(targets[i])) {
                System.out.print("yes ");
            }
            else {
                System.out.print("no ");
            }
        }
    }
}
