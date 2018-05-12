
 

/*
 * @Author  : //name
 * @Date :
 */
public class Professional extends Course {

    private int courseFee;
    private String enrolDate;
    private int roomNo;
    private int dailyHour;
    private int downPayment;
    private boolean started;
    private boolean completed;

    /*
     * Constructor for Professional with inputed parameters.
     */
    public Professional(String courseName, String instructorName, int totalCourseHours, int courseFee, int dailyNumber) {
        super(courseName, instructorName, totalCourseHours);
        this.enrolDate = "";
        this.roomNo = 0;
        this.downPayment = 0;
        this.completed = false;

    }


    public void enrolParticularCourse(String studentName, String enrolDate, int downPayment, int roomNo) {

        if (started) {
            System.out.println("Class is started...");
            System.out.println("Instructor Name : " + getInstructorName() + "\n" + "Room number : " + roomNo + "\n" + "Student Name: " + getStudentName());
        } else {
            super.setStudentName(studentName);
            this.enrolDate = enrolDate;
            this.roomNo = roomNo;
            this.downPayment = downPayment;
            this.started = true;
            this.completed = false;
        }
    }

    public void courseCompletion() {
        if (this.completed) {
            System.out.println("The course is completed.");
        } else {
            super.setStudentName("");
            this.enrolDate = "";
            this.downPayment = 0;
            this.started = false;
            this.completed = true;
        }
    }

    public void getAllInfo() {
        System.out.println("Course name : " + super.getCourseName());
        System.out.println("Instructor name: " + super.getInstructorName());
        System.out.println("Course fee: " + getCourseFee());
    }

    public void displayCourse() {
        super.DisplayInfo();
        if (started) {
            System.out.println(" Completed status " + this.completed);
            System.out.println("Enrolled Date :  " + this.enrolDate);
            System.out.println("Down payment : " + this.downPayment);
            System.out.println("Student name: " + super.getStudentName());
        }
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

    public void setDailyHour(int dailyhour) {
        this.dailyHour = dailyhour;
    }

    public int getCourseFee() {
        return this.courseFee;
    }

    public String getEnrolDate() {
        return this.enrolDate;
    }

    public int getRoomNo() {
        return this.roomNo;
    }

    public int getDailyHour() {
        return this.dailyHour;
    }

    public int getDownPayment() {
        return this.downPayment;
    }

    public boolean isStarted() {
        return this.started;
    }

    public boolean isCompleted() {
        return this.completed;
    }

}
