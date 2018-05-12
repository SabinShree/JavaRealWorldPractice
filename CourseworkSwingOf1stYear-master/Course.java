
 

/*
 * @Author  : //name
 * @Date : 
 */
public class Course {
	private String courseName;
	private String instructorName;
	private String studentName;
	private int totalCourseHours;

	/*
	 * Constructor for course with inputted parameters.
	 */
	public Course(String courseName, String instructorName, int totalCourseHours) {
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.totalCourseHours = totalCourseHours;
		this.studentName = "";
	}

	public String getCourseName() {
		return courseName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getTotalCourseHours() {
		return totalCourseHours;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/*
	 * display .....
	 */
	public void DisplayInfo() {
		System.out.println("Course name: " + this.courseName + "\n" + "Total hours : " + this.totalCourseHours + "\n"
				+ " Instructor Name: " + this.instructorName);
		if (!this.studentName.equals("") && !this.studentName.isEmpty()) {
			System.out.print("Student Name: " + this.studentName);

		}
	}

}
