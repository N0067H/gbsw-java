class PrintOdd {
    public static void oddPrint(int x) {
        if (x % 2 == 0) {
            System.out.print(x + " ");
        }
    }
    
    public static void main(String[] args) {
        oddPrint(15);
        oddPrint(10);
    }
}
