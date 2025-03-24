public class Student {
    private String name;
    private int[] marks;
    private double totalMarks;
    private double average;
    private char grade;

    // Constructor
    public Student(String name, int numSubjects) {
        this.name = name;
        this.marks = new int[numSubjects];
    }

    // Method to input marks
    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for " + name + ":");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    // Method to calculate total marks, average, and grade
    public void calculateResults() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        average = totalMarks / marks.length;
        grade = assignGrade(average);
    }

    // Method to assign grade based on average
    private char assignGrade(double average) {
        if (average >= 80) return 'A';
        else if (average >= 60) return 'B';
        else if (average >= 40) return 'C';
        else return 'D';
    }

    // Method to display student results
    public void displayResults() {
        System.out.println("\nStudent: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average: " + average + "%");
        System.out.println("Grade: " + grade);
    }
}
