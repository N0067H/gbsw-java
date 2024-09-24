class Pyramid {
    public static void printPyramid(int level) {
        for (int i = 0; i < level; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printPyramid(5);
    }
}
