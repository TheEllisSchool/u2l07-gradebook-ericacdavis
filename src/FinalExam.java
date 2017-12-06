
public class FinalExam extends GradedActivity{
//TTRIBUTES
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	//methods
	public FinalExam(int questions, int missed) {
		setNumQuestionsAndPoints(questions);
		setNumMissed(missed);
		
		double s = (numQuestions - numMissed) * pointsEach;
		setScore(s);
	}
	
	public void setNumQuestionsAndPoints(int q) {
		if (q > 0) {
			numQuestions = q;
			pointsEach = 110/numQuestions;
		} else {
			numQuestions = 50;
			pointsEach = 100/ numQuestions;
			System.out.println("Num of Questions must be positive, default to 50 questions");
		}
	}
	public void setNumMissed(int m) {
		if(m>=0 && m <= numQuestions) {
			numMissed = m;	
		} else {
			numMissed= 0;
			System.out.println("Num Missed must be between 0 and num of questions, default to no missed questions");
		}
	}
	public double getPointsEach() {
		return pointsEach;
	}
	public int getNumMissed() {
		return numMissed;
	}
	public int getNumQuestions() {
		return numQuestions;
	}
}
