import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class mission1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> names = new ArrayList<>();



        System.out.println("학생의 이름을 입력하고 엔터를 누르세요. (한글로만 입력해야 합니다.)");
        System.out.println("0을 입력하면 종료");
        System.out.println("학생들을 다 입력했다면, print라고 입력해주세요.");

        while(true){
            String name = sc.next();
            if (name.equals("print")) {
                break;
            }
            else if(Pattern.matches("^[a-z A-Z]*$",name)){
                System.out.println("학생의 이름은 한글로만 입력해야 합니다.");
            }
            else if(Pattern.matches("^[ㄱ-ㅎ 가-힣]*$",name)) {
                names.add(name);
            }

        }
        System.out.println("[학생 명단(가나다순)]");
        for(int i = 0; i < names.size(); i++){
            Collections.sort(names);
            System.out.println(names.get(i));
        }





    }
}
