public class Student {
    private String name;
    private int korean;
    private int english;

    public void print(){
        System.out.println("이름 : "+getName());
        System.out.println("국어 : "+getKorean());
        System.out.println("영어 : "+getEnglish());
    }

    public Student(String name, int korean, int english) {
        this.name = name;
        this.korean = korean;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}
