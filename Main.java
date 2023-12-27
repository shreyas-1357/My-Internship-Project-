package in.quiz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?", List.of("Berlin", "Paris", "Madrid", "Rome"), 1));
        questions.add(new Question("Which planet is known as the \"Red Planet\"?", List.of("Mars", "Venus", "Jupiter", "Saturn"), 0));
        questions.add(new Question("In which year did the Titanic sink?", List.of("1912", "1920", "1931", "1945"), 0));
        questions.add(new Question("Who wrote \"Romeo and Juliet\"?", List.of("Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain"), 1));

        
        Quiz quiz = new Quiz(questions);

      
        quiz.startQuiz();
    }
}
