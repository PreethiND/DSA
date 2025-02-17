package mathematics;

public class Solution {

    public static void main(String[] args) {
        int[] grades = {73, 67, 38, 33};
        int[] finalGrades = gradingStudents(grades);
        for(int i=0; i<grades.length; i++){
            System.out.println(finalGrades[i]);
        }
    }

    public static int[] gradingStudents(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if(grade < 38){
                grades[i] = grade;
            }
            else{
                int temp = grade;
                while (temp % 5 != 0) {
                    temp++;
                }
                int difference = temp - grade;
                if (difference < 3)
                    grades[i] =  temp;
                else
                    grades[i] = grade;
            }
        }
        return grades;
    }
}
