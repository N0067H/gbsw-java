class EchoLoop {
    public static void echo(String msg, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        echo("Hello Java", 10);
    }
}