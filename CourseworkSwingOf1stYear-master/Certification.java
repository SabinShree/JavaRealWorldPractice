
 

/*
 * @Author  : //name
 * @Date :
 */
public class Certification extends Course {
    private int courseFee;
    private String startDate;
    private String examDate;
    private String examCenter;
    private String certificateAwardedBy;
    private String validTill;
    private boolean started;

    /*
     * Constructor for Certification with inputed parameters.
     */
    public Certification(String courseName, String instructorName, int totalCourseHours, int courseFee, String certificateAwardedBy, String validTill) {
        super(courseName, instructorName, totalCourseHours);
        this.certificateAwardedBy = certificateAwardedBy;
        this.validTill = validTill;
        this.courseFee = courseFee;
        this.startDate = "";
        this.examDate = "";
        this.examCenter = "";
        this.started = false;
    }

    public void setCourseChange(int newFee) {
        if (!started) {
            this.courseFee = newFee;
        } else {
            System.out.println("Sorry!, It is not possible to change the course");
        }
    }

    public void enrolCertificationCourse(String studentName, String startDate, String examDate, String examCenter) {
        if (!started) {
            super.setStudentName(studentName);
            this.started = true;

        } else {
            System.out.println("Course is already started");
            System.out.println("New start Date " + startDate);
            this.examCenter = examCenter;
            this.examDate = examDate;

        }
    }

    public void displayDetailCourse() {
        super.DisplayInfo();
        if (started == true) {
            System.out.println("Student Name: " + super.getStudentName());
            System.out.println("Exam date : " + getExamDate());
            System.out.println("Exam center name " + getExamCenter());
            System.out.println("Certification validity duration : " + getValidTill());
        }

    }

    public int getCourseFee() {
        return courseFee;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getExamDate() {
        return examDate;
    }

    public String getExamCenter() {
        return examCenter;
    }

    public String getCertificateAwardedBy() {
        return certificateAwardedBy;
    }

    public String getValidTill() {
        return validTill;
    }

    public boolean isStarted() {
        return started;
    }

}
