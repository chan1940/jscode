import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("[구구단] 몇 단을 출력하실건가요?");

            if(scan.hasNextInt()){
                int num = scan.nextInt();

                if(num < 1 || num > 9){
                    System.out.println("1단에서 9단까지만 출력이 가능합니다.");
                }
                else if (1 <= num && num <= 9){
                    for(int i = 1; i < 10; i++){
                        System.out.println(num + " * " + i + " = " + num*i);
                    }
                }
            }
            else{
                String fin = scan.next();
                if(fin.equals("exit")){
                    System.out.println("프로그램을 성공적으로 종료했습니다.");
                    break;
                }
                else{
                    System.out.println("exit을 입력해야 종료됩니다.");
                }
            }

        }










    }
}