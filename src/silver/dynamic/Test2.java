package silver.dynamic;

public class Test2 {
    // 메모이제이션(Memoization): 한 번 계산된 결과를 메모, 즉 저장해놓기 위한 배열 초기화
    public static long[] d = new long[100];

    // Top-bottom: 피보나치 함수를 재귀 함수로 구현
    public static long fibo(int x) {
        // 종료 조건
        if (x == 1 || x == 2) {
            return 1;
        }
        // 이미 계산한 적 있는 문제라면 그대로 반환
        if (d[x] != 0) {
            return d[x];
        }

        // 아직 계산하지 않은 문제라면 점화식에 따라서 피보나치 결과 반환
        d[x] = fibo(x - 1) + fibo(x - 2);
        return d[x];
    }

    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

}
