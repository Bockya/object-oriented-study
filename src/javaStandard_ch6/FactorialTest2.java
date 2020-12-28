package javaStandard_ch6;

class FactorialTest2 {
    public static void main(String[] args) {
        int n = 21;
        long result;

        for (int i = 1; i <= n; i++) {
            result = factorial(i);

            if (result == -1) {
                System.out.printf("유효하지 않은 값입니다. (0 < n <= 20) : %d%n", n);
                break;
            }
            System.out.printf("%2d != %20d%n", i, result);
        }
    }

    private static long factorial(int n) {
        if (n <= 0 || n > 20) return -1; //매개변수의 유효성 검사
        long result = 1; //int는 12!까지 가능
        while (n != 0) //반복문이 재귀호출보다 빠름
            result *= n--;
        return result;
    }
}
