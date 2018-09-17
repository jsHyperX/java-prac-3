class CustomException extends Exception {
    public CustomException(final String message) {
        super(message);
    }
}

public class StudentMarks {
    private int numOfStudents;
    private int[] marks;

    public StudentMarks() {};

    public void setNumOfStudents(int n) { this.numOfStudents = n; }

    public int getNumOfStudents() { return numOfStudents; }

    public void setMarks(int a[],int n) throws CustomException {
        this.marks = new int[n];
        for(int i=0;i<n;i++) {
            if(a[i]>=100 || a[i]<=0) throw new CustomException("please enter a valid score");
            this.marks[i] = a[i];
        }
    }

    public int[] getMarks() { return this.marks; }

}

