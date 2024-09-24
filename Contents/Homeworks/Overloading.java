class Overloading {
    public static String sum(String l, String r) {
        return l + r;
    }

    public static int sum(int l, int r) {
        return l + r;
    }

    public static int sum(int l, int m, int r) {
        return l + m + r;
    }

    public static void main(String[] args) {
        System.out.println(sum("Hello ", "World"));
        System.out.println(sum(4, 5));
        System.out.println(sum(5, 7, 9));
    }
}
