package in.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int userScore;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.userScore = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            List<String> options = question.getOption();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((char) ('a' + i) + ") " + options.get(i));
            }

            System.out.print("Your answer: ");
            char userAnswer = scanner.next().toLowerCase().charAt(0);

            if (userAnswer - 'a' == question.getCorrectIndex()) {
                System.out.println("Correct!\n");
                userScore++;
            } else {
                System.out.println("Incorrect. The correct answer is " + (char) ('a' + question.getCorrectIndex()) + ".\n");
            }
        }

        System.out.println("Quiz complete! Your score: " + userScore + "/" + questions.size());
    }
}
