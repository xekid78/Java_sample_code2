class Main {
    public static void main(String[] args) {
        int number = 50;
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ": " + tribonacci(i));
        }
    }
    public static long tribonacci(int num) {
        return tri2(0, 0, 1, num);
    }
    public static long tri2(long a, long b, long c, long d) {
        if (d < 2) {
            return a;
        }
        return tri2(a + b + c, a, b, d - 1);
    }
}
