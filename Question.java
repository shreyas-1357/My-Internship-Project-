package in.quiz;

import java.util.List;

public class Question {

	String question;
	List<String> option;
	int correctIndex;
	
	
	public Question(String question, List<String> option, int correctIndex) {
		super();
		this.question = question;
		this.option = option;
		this.correctIndex = correctIndex;
	}
	
	
	public String getQuestion() {
		return question;
	}
	public List<String> getOption() {
		return option;
	}
	public int getCorrectIndex() {
		return correctIndex;
	}
	
	
	
	
	
	
}
