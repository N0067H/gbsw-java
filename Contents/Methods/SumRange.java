
class SumRange {
    public static int sumRange(int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            result += i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumRange(1, 10));
    }
}
