package FirstYearJava;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TrainingInstitute extends JFrame implements ActionListener {

    private final JTextField courseNoForCertificationTextField;
    private JFrame frameMenu;
    private JLabel courseFeeLabel;
    private JLabel courseDurationsLabel;
    private JLabel studentNameLabel;
    private JLabel enrollDateLabel;
    private JLabel courseNoLabel;
    private JLabel downPaymentLabel;
    private JLabel roomNoLabel;
    private JLabel dailyCourseHourLabel;
    private JLabel courseStartDateLabel;
    private JLabel examDateLabel;
    private JLabel examCenterLabel;
    private JLabel awardingBodyLabel;
    private JLabel certificateValidityDurationLabel;

    private JButton addToProfessionalButton;
    private JButton enrolToProfessionalButton;
    private JButton enrolToCertificationButton;
    private JButton addToCertificationButton;
    private JButton courseCompletionButton;
    private JButton clearButton;
    private JButton displayAllButton;

    private JTextField dailyCourseHourTextField;
    private JTextField certificateValidityDurationTextField;
    private JTextField awardingBodyTextField;
    private JTextField roomNoTextField;
    private JTextField courseNameTextField;
    private JTextField instructorNameTextField;
    private JTextField startDateTextField;
    private JTextField courseDurationTextField;
    private JTextField studentNameTextField;
    private JTextField studentNameForProfessionalTextField;
    private JTextField enrollDateTextField;
    private JTextField downPaymentTextField;
    private JTextField courseNoTextField;
    private JTextField courseDurationsForCertificationTextField;
    private JTextField courseFeeTextForCertificationField;
    private JTextField examDateField;
    private JTextField examCenterField;
    private JTextField courseFeeTextField;

    private List<Course> courseList = new ArrayList<>();


    public static void main(String[] args) {
        new TrainingInstitute();
    }

    public TrainingInstitute() {
        frameMenu = new JFrame("Rental System");
        JPanel wholePanel = new JPanel();

        JLabel justDetails = new JLabel("<html><u>Professional course</u></html>");
        justDetails.setFont(new Font("Arial", Font.BOLD, 34));
        justDetails.setBounds(250, 10, 600, 50);
        wholePanel.add(justDetails);


        JLabel instructorNameLabel = new JLabel("Instructor Name");
        instructorNameLabel.setBounds(20, 60, 290, 40);
        instructorNameLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(instructorNameLabel);

        instructorNameTextField = new JTextField();
        instructorNameTextField.setBounds(150, 63, 619, 30);
        instructorNameTextField.setToolTipText("Enter a instructor name");
        instructorNameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(instructorNameTextField);


        JLabel courseNameLabel = new JLabel("Course Name");
        courseNameLabel.setBounds(20, 105, 290, 40);
        courseNameLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(courseNameLabel);

        courseNameTextField = new JTextField();
        courseNameTextField.setBounds(150, 105, 619, 33);
        courseNameTextField.setToolTipText("course name here");
        courseNameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(courseNameTextField);


        courseFeeLabel = new JLabel("Course Fee");
        courseFeeLabel.setBounds(20, 190, 230, 40);
        courseFeeLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(courseFeeLabel);

        courseFeeTextField = new JTextField();
        courseFeeTextField.setBounds(173, 190, 265, 33);
        courseFeeTextField.setToolTipText("Course Fee here");
        courseFeeTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(courseFeeTextField);
//
        courseDurationsLabel = new JLabel("Total course hours");
        courseDurationsLabel.setBounds(20, 147, 230, 40);
        courseDurationsLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(courseDurationsLabel);

        courseDurationTextField = new JTextField();
        courseDurationTextField.setBounds(173, 147, 265, 33);
        courseDurationTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(courseDurationTextField);

        dailyCourseHourLabel = new JLabel("Daily hours");
        dailyCourseHourLabel.setBounds(450, 147, 150, 40);
        dailyCourseHourLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(dailyCourseHourLabel);

        dailyCourseHourTextField = new JTextField();
        dailyCourseHourTextField.setBounds(550, 153, 220, 33);
        dailyCourseHourTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(dailyCourseHourTextField);

        addToProfessionalButton = new JButton("Add Course to Professional");
        addToProfessionalButton.setBounds(450, 190, 318, 33);
        addToProfessionalButton.setFocusPainted(false);
        addToProfessionalButton.setFont(new Font("sans-serif", Font.BOLD, 14));
        addToProfessionalButton.setForeground(new Color(255, 255, 230));
        addToProfessionalButton.setBackground(new Color(76, 185, 80));
        addToProfessionalButton.addActionListener(this);
        wholePanel.add(addToProfessionalButton);

//

//
        roomNoLabel = new JLabel("<html>Room Number<sup>*</sup></html>");
        roomNoLabel.setBounds(418, 318, 130, 40);
        roomNoLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(roomNoLabel);

        roomNoTextField = new JTextField();
        roomNoTextField.setBounds(550, 320, 200, 33);
        roomNoTextField.setBorder(new LineBorder( Color.RED,  1, true));
        roomNoTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(roomNoTextField);

        JLabel studentNameForProfessional = new JLabel("<html>Student Name<sup>*</sup></html>");
        studentNameForProfessional.setBounds(20, 235, 230, 40);
        studentNameForProfessional.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(studentNameForProfessional);

        studentNameForProfessionalTextField = new JTextField();
        studentNameForProfessionalTextField.setBounds(150, 235, 600, 33);
        studentNameForProfessionalTextField.setToolTipText("Student name here......");
        studentNameForProfessionalTextField.setBorder(new LineBorder(Color.red, 1, true));
        studentNameForProfessionalTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(studentNameForProfessionalTextField);


        enrollDateLabel = new JLabel("Enroll Date");
        enrollDateLabel.setBounds(20, 280, 230, 40);
        enrollDateLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(enrollDateLabel);

        enrollDateTextField = new JTextField();
        enrollDateTextField.setBounds(150, 280, 250, 33);
        enrollDateTextField.setToolTipText("Enroll date here");
        enrollDateTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(enrollDateTextField);

        courseNoLabel = new JLabel("Course No");
        courseNoLabel.setBounds(418, 280, 230, 40);
        courseNoLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(courseNoLabel);

        courseNoTextField = new JTextField();
        courseNoTextField.setBounds(550, 280, 200, 33);
        courseNoTextField.setToolTipText("Course No here");
        courseNoTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(courseNoTextField);
        ;


        downPaymentLabel = new JLabel("Down Payment");
        downPaymentLabel.setBounds(20, 320, 130, 40);
        downPaymentLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(downPaymentLabel);

        downPaymentTextField = new JTextField();
        downPaymentTextField.setBounds(150, 320, 250, 33);
        downPaymentTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(downPaymentTextField);

        courseCompletionButton = new JButton("Check Completion Status");
        courseCompletionButton.setBounds(20, 360, 378, 35);
        courseCompletionButton.setFocusPainted(false);
        courseCompletionButton.setFont(new Font("sans-serif", Font.BOLD, 14));
        courseCompletionButton.setForeground(new Color(255, 255, 230));
        courseCompletionButton.setBackground(new Color(76, 185, 80));
        courseCompletionButton.addActionListener(this);
        wholePanel.add(courseCompletionButton);


        JLabel courseNoForCertification= new JLabel("<html>Course No<sup>*</sup></html>");
        courseNoForCertification.setForeground(new Color(22, 22, 22));
        courseNoForCertification.setBounds(20, 640, 230, 40);
        courseNoForCertification.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(courseNoForCertification);

        courseNoForCertificationTextField = new JTextField();
        courseNoForCertificationTextField.setBorder(new LineBorder(Color.RED , 1, true));
        courseNoForCertificationTextField.setBounds(150, 640, 250, 33);
        courseNoForCertificationTextField.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(courseNoForCertificationTextField);

        studentNameLabel = new JLabel("<html>Student Name<sup>*</sup></html>");
        studentNameLabel.setBounds(20, 685, 230, 40);
        studentNameLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(studentNameLabel);

        studentNameTextField = new JTextField();
        studentNameTextField.setBounds(150, 685, 619, 33);
        studentNameTextField.setToolTipText("Student name here");
        studentNameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(studentNameTextField);

        courseStartDateLabel = new JLabel("Start Date");
        courseStartDateLabel.setBounds(420, 725, 130, 40);
        courseStartDateLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(courseStartDateLabel);

        startDateTextField = new JTextField();
        startDateTextField.setBounds(520, 725, 250, 33);
        startDateTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(startDateTextField);


        examDateLabel = new JLabel("Exam Date");
        examDateLabel.setBounds(420, 640, 230, 40);
        examDateLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(examDateLabel);

        examDateField = new JTextField();
        examDateField.setBounds(520, 640, 250, 33);
        examDateField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(examDateField);

        examCenterLabel = new JLabel("Exam Center");
        examCenterLabel.setBounds(20, 725, 130, 40);
        examCenterLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(examCenterLabel);

        examCenterField = new JTextField();
        examCenterField.setBounds(150, 725, 250, 33);
        examCenterField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(examCenterField);
//
        awardingBodyLabel = new JLabel("Awarded By ");
        awardingBodyLabel.setBounds(20, 555, 230, 40);
        awardingBodyLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(awardingBodyLabel);

        awardingBodyTextField = new JTextField();
        awardingBodyTextField.setBounds(150, 555, 250, 33);
        awardingBodyTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(awardingBodyTextField);

        dailyCourseHourLabel = new JLabel("Daily hours ");
        dailyCourseHourLabel.setBounds(420, 555, 230, 40);
        dailyCourseHourLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(dailyCourseHourLabel);

        dailyCourseHourTextField = new JTextField();
        dailyCourseHourTextField.setBounds(550, 555, 220, 33);
        dailyCourseHourTextField.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(dailyCourseHourTextField);


        certificateValidityDurationLabel = new JLabel("Validity Date");
        certificateValidityDurationLabel.setBounds(20, 595, 130, 40);
        certificateValidityDurationLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(certificateValidityDurationLabel);

        certificateValidityDurationTextField = new JTextField();
        certificateValidityDurationTextField.setBounds(150, 595, 250, 33);
        certificateValidityDurationTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(certificateValidityDurationTextField);


        addToCertificationButton = new JButton("Add Course to Certification");
        addToCertificationButton.setBounds(415, 595, 350, 33);
        addToCertificationButton.setFocusPainted(false);
        addToCertificationButton.setFont(new Font("sans-serif", Font.BOLD, 14));
        addToCertificationButton.setForeground(new Color(255, 255, 230));
        addToCertificationButton.setBackground(new Color(76, 185, 80));
        addToCertificationButton.addActionListener(this);
        wholePanel.add(addToCertificationButton);

//
        enrolToProfessionalButton = new JButton("Enrol Student to Professional course");
        enrolToProfessionalButton.setBounds(420, 360, 330, 35);
        enrolToProfessionalButton.setFocusPainted(false);
        enrolToProfessionalButton.setFont(new Font("sans-serif", Font.BOLD, 14));
        enrolToProfessionalButton.setForeground(new Color(255, 255, 230));
        enrolToProfessionalButton.setBackground(new Color(76, 185, 80));
        enrolToProfessionalButton.addActionListener(this);
        wholePanel.add(enrolToProfessionalButton);

        JLabel certificationCourse = new JLabel("<html><u>Certification course</u><html>");
        certificationCourse.setFont(new Font("Arial", Font.BOLD, 34));
        certificationCourse.setBounds(250, 392, 600, 50);
        wholePanel.add(certificationCourse);

        JLabel instructorNameForCertificationLabel = new JLabel("Instructor Name");
        instructorNameForCertificationLabel.setBounds(20, 438, 290, 40);
        instructorNameForCertificationLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(instructorNameForCertificationLabel);

        instructorNameTextField = new JTextField();
        instructorNameTextField.setBounds(150, 440, 619, 30);
        instructorNameTextField.setToolTipText("Enter a instructor name");
        instructorNameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(instructorNameTextField);


        JLabel courseNameForCertificationLabel = new JLabel("Course Name");
        courseNameForCertificationLabel.setBounds(20, 475, 290, 40);
        courseNameForCertificationLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(courseNameForCertificationLabel);

        courseNameTextField = new JTextField();
        courseNameTextField.setBounds(150, 475, 619, 33);
        courseNameTextField.setToolTipText("course name here");
        courseNameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(courseNameTextField);

        JLabel courseDurationsForCertificationLabel = new JLabel("Course Duration");
        courseDurationsForCertificationLabel.setBounds(20, 515, 230, 40);
        courseDurationsForCertificationLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(courseDurationsForCertificationLabel);

        courseDurationsForCertificationTextField = new JTextField();
        courseDurationsForCertificationTextField.setBounds(173, 515, 265, 33);
        courseDurationsForCertificationTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(courseDurationsForCertificationTextField);


        JLabel courseFeeForCertificationLabel = new JLabel("Course Fee");
        courseFeeForCertificationLabel.setBounds(450, 515, 230, 40);
        courseFeeForCertificationLabel.setFont(new Font("arial", Font.BOLD, 16));
        wholePanel.add(courseFeeForCertificationLabel);

        courseFeeTextForCertificationField = new JTextField();
        courseFeeTextForCertificationField.setBounds(550, 515, 220, 33);
        courseFeeTextForCertificationField.setToolTipText("Course Fee here");
        courseFeeTextForCertificationField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        wholePanel.add(courseFeeTextForCertificationField);




        JSeparator separator = new JSeparator();
        separator.setBounds(10, 770, 770, 10);
        separator.setBackground(new Color(233, 0, 0));
        wholePanel.add(separator);

        enrolToCertificationButton = new JButton("Enrol Student to Certification course");
        enrolToCertificationButton.setBounds(200, 785, 330, 35);
        enrolToCertificationButton.setFocusPainted(false);
        enrolToCertificationButton.setFont(new Font("sans-serif", Font.BOLD, 14));
        enrolToCertificationButton.setForeground(new Color(255, 255, 230));
        enrolToCertificationButton.setBackground(new Color(76, 185, 80));
        enrolToCertificationButton.addActionListener(this);
        wholePanel.add(enrolToCertificationButton);


        clearButton = new JButton("Clear All ");
        clearButton.setBackground(new Color(205, 66, 26));
        clearButton.setForeground(Color.WHITE);
        clearButton.setBounds(140, 830, 220, 40);
        clearButton.setFont(new Font("arial", Font.BOLD, 16));
        clearButton.addActionListener(this);
        wholePanel.add(clearButton);

        displayAllButton = new JButton("Display all ");
        displayAllButton.setBackground(new Color(196, 147, 239));
        displayAllButton.setForeground(Color.WHITE);
        displayAllButton.setBounds(400, 830, 220, 40);
        displayAllButton.setFont(new Font("arial", Font.BOLD, 16));
        displayAllButton.addActionListener(this);
        wholePanel.add(displayAllButton);

        wholePanel.setLayout(null);
        wholePanel.setBorder(new LineBorder(Color.RED, 2, true));
        wholePanel.setBackground(Color.white);

        frameMenu.setSize(800, 925);
        frameMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameMenu.add(wholePanel);
        frameMenu.setLocationRelativeTo(null);
        frameMenu.setResizable(false);
        frameMenu.setVisible(true);
    }

    // down payment, course fee, room no, daily hour, course duration and the course number  should be converted to integer.


    public void clearAll() {
//        courseNoTextField.setText("");
        instructorNameTextField.setText("");
        courseNameTextField.setText("");
        downPaymentTextField.setText("");
        studentNameTextField.setText("");
        courseDurationTextField.setText("");
        courseFeeTextField.setText("");
        awardingBodyTextField.setText("");
        enrollDateTextField.setText("");
        dailyCourseHourTextField.setText("");
        roomNoTextField.setText("");
        certificateValidityDurationTextField.setText("");
        examDateField.setText("");
        examCenterField.setText("");
        startDateTextField.setText("");
    }

    public void addCourseToProfessional() {
        try {
            String courseName = courseNameTextField.getText().trim();
            String instructorName = instructorNameTextField.getText().trim();
            int totalHoursToCompleteCourse = Integer.parseInt(courseDurationTextField.getText().trim());

            if (!courseName.isEmpty() && !instructorName.isEmpty() && totalHoursToCompleteCourse != 0) {
                Professional professional = new Professional(courseName, instructorName, totalHoursToCompleteCourse, 0, 0);
                courseList.add(professional);
                JOptionPane.showMessageDialog(frameMenu, "Added : Course Name : " + courseName + "\nInstructor Name : " + instructorName + "\nTotal Hours of Course  " + totalHoursToCompleteCourse + " Successfully.");

            } else {
                JOptionPane.showMessageDialog(frameMenu, "Some input might be missing", "Error while inputting", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frameMenu, "Error");
        }
    }

    public void addCourseToCertification() {
        try {
            String courseName = courseNameTextField.getText().trim();
            String instructorName = instructorNameTextField.getText().trim();
            int totalHoursToCompleteCourse = Integer.parseInt(courseDurationTextField.getText().trim());
            if (!courseName.isEmpty() && !instructorName.isEmpty() && totalHoursToCompleteCourse != 0) {
                Certification certification = new Certification(courseName, instructorName, totalHoursToCompleteCourse, 0, "", "");
                courseList.add(certification);
                JOptionPane.showMessageDialog(frameMenu, "Added : Course Name : " + courseName + "\nInstructor Name : " + instructorName + "\nTotal Hours of Course  " + totalHoursToCompleteCourse + " Successfully.");
            } else {
                JOptionPane.showMessageDialog(frameMenu, "Some input might be missing", "Error while inputting", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frameMenu, "ERROR");
        }
    }

    public void enrollStudentToProfessionalCourse() {
        try {
            String studentName = studentNameTextField.getText();
            String enrollDate = enrollDateTextField.getText();
            int downPayment = Integer.parseInt(downPaymentTextField.getText());
            int roomNo = Integer.parseInt(roomNoTextField.getText());
            if (checkArrayList() != -1) {
                if (courseList.get(checkArrayList()) instanceof Professional) {
                    Professional professional = (Professional) courseList.get(checkArrayList());
                    if (!studentName.isEmpty() && !enrollDate.isEmpty() && downPayment != 0 && roomNo != 0) {
                        professional.enrolParticularCourse(studentName, enrollDate, downPayment, roomNo);
                        JOptionPane.showMessageDialog(frameMenu, "Added : Student Name : " + studentName + "\nEnroll date : " + enrollDate + "\nDown payment  " + downPayment + "\nRoom number " + roomNo + " Successfully.");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frameMenu, "Error");
        }
    }

    public int checkArrayList() {
        int courseNo = Integer.parseInt(courseNoTextField.getText());
        if (courseNo >= 0 && courseNo <= courseList.size()) {
            return courseNo;
        } else {
            JOptionPane.showMessageDialog(frameMenu, "Error while checking List of course", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return -1;
    }

    public void courseCompletionStatus() {
        if (checkArrayList() != -1) {
            if (courseList.get(checkArrayList()) instanceof Professional) {
                Professional professional = (Professional) courseList.get(checkArrayList());
                professional.courseCompletion();
            }
        }
    }

    public void enrolForCertificationCourse() {
        String studentName = studentNameTextField.getText();
        String startDate = startDateTextField.getText();
        String examCenter = examCenterField.getText();
        String examDate = examDateField.getText();
        if (checkArrayList() != -1) {
            Certification certification = (Certification) courseList.get(checkArrayList());
            if (!studentName.isEmpty() && !startDate.isEmpty() && !examCenter.isEmpty() && !examDate.isEmpty()) {
                certification.enrolCertificationCourse(studentName, startDate, examDate, examCenter);
                JOptionPane.showMessageDialog(frameMenu, "Added : student Name : " + studentName + "\nStart Name : " + startDate + "\nExam date  " + examDate + "\nExam Center " + examCenter + " Successfully.", "Successfully added. ", JOptionPane.PLAIN_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(frameMenu, "Some input Field is missing", "Error while inputting", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void displayAll() {
        for (Course course : courseList) {
            if (course instanceof Certification) {
                Certification certification = (Certification) course;
                System.out.println("Detail of Certification Class are : ");
                certification.displayDetailCourse();
                System.out.println();
            }
            if (course instanceof Professional) {
                Professional professional = (Professional) course;
                System.out.println("Details of Professional Class are : ");
                professional.displayCourse();
                System.out.println();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(clearButton)) {
            clearAll();
        }
        if (e.getSource().equals(displayAllButton)) {
            displayAll();
        }

        if (e.getSource().equals(addToProfessionalButton)) {
            addCourseToProfessional();
        }
        if (e.getSource().equals(addToCertificationButton)) {
            addCourseToCertification();
        }
        if (e.getSource().equals(enrolToProfessionalButton)) {
            enrollStudentToProfessionalCourse();

        }
        if (e.getSource().equals(courseCompletionButton)) {
            courseCompletionStatus();

        }
        if (e.getSource().equals(enrolToCertificationButton)) {
            enrolForCertificationCourse();
        }
    }


}
