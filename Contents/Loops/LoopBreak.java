class LoopBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        int i = 0;
        while (i < 5) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
