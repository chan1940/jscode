import java.util.ArrayList;
import java.util.Scanner;

public class mission2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> numbers = new ArrayList<>();

        while(true){
            System.out.println("선수의 번호를 입력하세요.");
            int num = sc.nextInt();
            System.out.println("이 선수의 100m 달리기 기록이 몇 초인지 입력.");
            double time = sc.nextDouble();
            numbers.add(num,time);
            System.out.println(numbers);
        }

    }
}
