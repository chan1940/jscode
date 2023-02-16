import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);



        while(true){
            System.out.println("몇 기인지 입력해주세요.");

            int num = scanner.nextInt();

            if(num < 1 || num > 3){
                System.out.println("프로그램 종료");
                break;
            }
            else{
                System.out.println("HTML 과목 점수 입력해주세요.");

                int hscore = scanner.nextInt();

                System.out.println("CSS 과목 점수 입력해주세요.");

                int cscore = scanner.nextInt();

                System.out.println("Javascript 과목 점수 입력해주세요.");

                int jscore = scanner.nextInt();

                int sum = hscore + cscore + jscore;

                float avg = (float)(sum/3);

                int max = 0;
                if(max < hscore){
                    max = hscore;
                }
                if (max < cscore) {
                    max = cscore;
                }
                if(max < jscore){
                    max = jscore;
                }

                int min=100;
                if(min > hscore){
                    min = hscore;
                }
                if(min > cscore)
                    min = cscore;
                if(min > jscore){
                    min = jscore;
                }

                int count = 0;
                if(hscore >= 100){
                    count++;
                }
                if(cscore >= 100){
                    count++;
                }
                if(jscore >= 100){
                    count++;
                }

                if(num == 1 || num == 2){
                    if(avg >= 60 || count >= 2){
                        System.out.println("합격입니다.");
                        System.out.println("전체 과목 중 최고 점은 "+max+"점입니다.");
                        System.out.println("전체 과목 중 최저 점은 "+min+"점입니다.");
                        System.out.println("전체 과목의 평균은 "+avg+"점입니다.");
                    }
                    else{
                        System.out.println("불합격입니다.");
                        System.out.println("전체 과목 중 최고 점은 "+max+"점입니다.");
                        System.out.println("전체 과목 중 최저 점은 "+min+"점입니다.");
                        System.out.println("전체 과목의 평균은 "+avg+"점입니다.");
                    }
                }
                else{
                    if(avg >= 70 || count >= 2){
                        System.out.println("합격입니다.");
                        System.out.println("전체 과목 중 최고 점은 "+max+"점입니다.");
                        System.out.println("전체 과목 중 최저 점은 "+min+"점입니다.");
                        System.out.println("전체 과목의 평균은 "+avg+"점입니다.");
                    }
                    else{
                        System.out.println("불합격입니다.");
                        System.out.println("전체 과목 중 최고 점은 "+max+"점입니다.");
                        System.out.println("전체 과목 중 최저 점은 "+min+"점입니다.");
                        System.out.println("전체 과목의 평균은 "+avg+"점입니다.");
                    }
                }
            }
        }






    }
}