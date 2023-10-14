import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner tR = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = tR.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            int subjectMarks;
            do {
                System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
                subjectMarks = tR.nextInt();
                if (subjectMarks < 0 || subjectMarks > 100) {
                    System.out.println("Marks should be between 0 and 100. Please re-enter.");
                }
            } while (subjectMarks < 0 || subjectMarks > 100);

            totalMarks += subjectMarks;
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        // Grade calculation
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";5
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);

        tR.close();
    }
}
