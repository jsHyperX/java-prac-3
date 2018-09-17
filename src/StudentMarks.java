
class InvalidScoreException extends Exception {
    private String msg;

    public InvalidScoreException(String message) {
        this.msg = message;
    }

    public String getMessage() { return this.msg; }
}

public class StudentMarks {
    private int numOfStudents;
    private int[] marks;

    public StudentMarks() {};

    public StudentMarks(int n) {
        this.numOfStudents = n;
        this.marks = new int[n];
    }

    public void setNumOfStudents(int n) { this.numOfStudents = n; }

    public int getNumOfStudents() { return numOfStudents; }

    public void setMarks(int a[],int n) throws InvalidScoreException {
        for(int i=0;i<n;i++) {
            if (a[i] >= 100 || a[i] <= 0) {
                InvalidScoreException invalid = new InvalidScoreException("please enter a valid score");
                throw invalid;
            }
            this.marks[i] = a[i];
        }
    }

    public int[] getMarks() { return this.marks; }

}

