package Test3.Ques1_20;

public class Ques8 {
    public static void main(String[] args) {
        int score = 30;
        char grade = 'F';
        if(50 <= score <60)
            grade = 'D';
        else if (60 <= score < 70)
            grade = 'C';
        else if (70<= score <80)
            grade = 'B';
        else if (score >= 80)
            grade = 'A';
        System.out.println(grade);
    }
}
