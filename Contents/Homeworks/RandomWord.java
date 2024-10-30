import java.util.Random;
import java.util.Scanner;

public class RandomWord {
    public static void main(String[] args) {
        String[] when = { "오늘", "내일", "모레" };
        String[] where = { "옥상", "학교", "화장실", "우리집", "기능반" };
        String[] who = { "에스파", "아이브", "교장선생님", "담임선생님", "엔씨티" };
        String[] what = { "논다", "춤울 춘다", "먹는다", "뛴다", "운동한다" };
        String[] how = { "격렬하게", "조용히", "점잖게", "천천히", "잠자코" };

        Random random = new Random();
        int whenIndex = random.nextInt(when.length);
        int whereIndex = random.nextInt(where.length);
        int whoIndex = random.nextInt(who.length);
        int whatIndex = random.nextInt(what.length);
        int howIndex = random.nextInt(how.length);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.next();
        
        System.out.println("When: " + when[whenIndex]);
        System.out.println("Where: " + where[whereIndex]);
        System.out.println("Who: " + who[whoIndex]);
        System.out.println("What: " + what[whatIndex]);
        System.out.println("How: " + how[howIndex]);
        System.out.println("Name: " + name);
        System.out.println(name + "는 " + when[whenIndex] + " " + where[whereIndex] + "에서 " + who[whoIndex] + "와 함께 " + how[howIndex] + " " + what[whatIndex] + ".");

        scanner.close();
    }
}