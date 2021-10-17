public class TestStudent {
    // bubble sort
    public static void sort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                double av1 = students[j].getAverage();
                double av2 = students[j+1].getAverage();
                if (av1 > av2){
                    var temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        var students = new Student[5];
        for (int i = 0; i < 5; i++) {
            students[i] = new Student("Student " + i);
            students[i].setRandomGrades();
        }
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s %-10s %n",
                "Name", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Average");
        for (int i = 0; i < 5; i++) {
            students[i].printStudentInformation();
        }
        TestStudent.sort(students);
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s %-10s %n",
                "Name", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Average");
        for (int i = 0; i < 5; i++) {
            students[i].printStudentInformation();
        }
        int i = '2';
        System.out.println(i);
    }
}
