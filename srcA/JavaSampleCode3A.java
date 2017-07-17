class Main {
    public static void main(String[] args) {
        int number = 50;
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ": " + tribonacci(i));
        }
    }
    public static long tribonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }

        long tri = 0;
        long tri_0 = 0;
        long tri_1 = 0;
        long tri_2 = 1;

        for (int i = 3; i <= num; i++) {
            tri = tri_0 + tri_1 + tri_2;
            tri_0 = tri_1;
            tri_1 = tri_2;
            tri_2 = tri;
        }
        return tri;
    }
}
