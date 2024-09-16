public class Student {
    private String studentName;
    private double studentMarks;
    private String studentId;
    
    // constructor
    public Student (String studentId, String studentName, double studentMarks ){
        this.studentName = studentName;
        this.studentMarks = studentMarks;
        this.studentId = studentId;
    } 
    
    //getter and setter
    public String getName() {
        return studentName;
    }
    public void setName(String studentName){
        this.studentName = studentName;
    }
    public double getMarks(){
        return studentMarks;
    }
    public void setMarks(double studentMarks){
        this.studentMarks = studentMarks;
    }
    public String getStudentid(){
        return studentId;
    }
    public void setStudentid(String studentId){
        this.studentId = studentId;
    }

}
