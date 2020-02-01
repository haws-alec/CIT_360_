import java.util.*;

public class java_list {
    public static void main(String[] args) {
        //Teacher provides scores for a test.
        System.out.println("Please enter the class scores for stats about the assignment.");
        Scanner input = new Scanner(System.in);
        //Teacher provides number of scores being entered
        System.out.print("Please enter the number of students that submitted this asignment:");
        int numberOfStudents = input.nextInt();
        int numberOfScores = 0;
        //Create list to hold scores
        List < Double > scores = new ArrayList < > ();
        input.nextLine();
        //Fill list with scores
        for (numberOfScores = 0; numberOfScores < numberOfStudents; numberOfScores++) {
            System.out.print("Enter assignment score: ");
            scores.add(input.nextDouble());
        }
        //Calculate Average
        double total = 0;
        for (int count = 0; count < scores.size(); count++) {
            total += scores.get(count);
        }
        double average = total / numberOfScores;

        //Present results
        System.out.println("The highest score was " + Collections.max(scores));
        System.out.println("The lowest score was " + Collections.min(scores));
        System.out.println("The  average score is " + average);
    }
}