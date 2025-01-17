package Inheritance_HW;

public class Student extends Person {
	
	// added constants

	private static final int MAXIMUM_SCORE = 6;
	private static final int MINIM_VALUE_FOR_SCORE = 2;
	private double score;

	Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		setScore(score);
	}





	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= MINIM_VALUE_FOR_SCORE && score <= MAXIMUM_SCORE) {
			this.score = score;
		} else {
			System.out.println("Wrong value for score.");
			this.score = 0;
		}
	}
	
	public void showStudentInfo(){
		this.showPersonInfo();
		System.out.println("Score - " + this.score);
	}

}
