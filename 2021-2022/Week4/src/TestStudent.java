public class TestStudent {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0]=new Student("Chiquita", "Cadman", "Gaines", "0000111122223333");
		students[1]=new Student("Elvis", "Maryam", "Rice", "0000-1111-2222-3333");
		students[2]=new Student("Colt", "Oren", "Riggs", "0000111122223333");
		students[3]=new Student("Elvis", "Ulysses", "Çela", "0000111122223333");
		students[4]=new Student("Henry", "Bryar", "Austin", "0000111122223333");
		students[5]=new Student("Ezra", "Chase", "Riley", "0000111122223333");
		students[6]=new Student("Hëna", "Howard", "Kirk", "0000111122223333");
		students[7]=new Student("Macaulay", "Alexander", "Grant", "0000111122223333");
		students[8]=new Student("Lewis", "Warren", "Tate", "0000111122223333");
		students[9]=new Student("Colette", "Geoffrey", "Çela", "0000111122223333");


//		Student[] res1=filterCorrectCreditCards(students);
//		for(Student s:res1)
//			System.out.println(s);

		Student[] res2=filterStudentsByFullName(students, "Çela");
		for(Student s:res2)
			System.out.println(s);

//		Student[] res3=filterStudentsByFullName(students, "elvis cela");
//		for(Student s:res3)
//			System.out.println(s);
//
//		Student[] res4=filterStudentsByFullName(students, "Çolet ga");
//		for(Student s:res4)
//			System.out.println(s);
	}


	public static Student[] filterStudentsByFullName(Student[] students, String substring){
		Student[] tmp = new Student[students.length];
		int matches=0;
		substring=substring.toLowerCase().replaceAll("ç", "c").replaceAll("ë", "e");
		String[] values = substring.split(" ");
		for (Student student : students) {
			boolean match=true;
			for (String value : values) {
				if (!(student.getFirstName() + student.getFathersName() + student.getLastName()).toLowerCase().replaceAll("ç", "c").replaceAll("ë", "e").replaceAll(" ", "").matches(".*" + value + ".*")) {
					match = false;
					break;
				}
			}
			if (match) {
				tmp[matches] = student;
				matches++;
			}

		}
		Student[] results = new Student[matches];
		if (matches >= 0)
			System.arraycopy(tmp, 0, results, 0, matches);
		return results;
	}


	public static Student[] filterCorrectCreditCards(Student[] students){
		String creditCardFormat = "\\d{4}-\\d{4}-\\d{4}-\\d{4}";
		Student[] tmp = new Student[students.length];
		int matches=0;
		for (Student student : students) {
			if (student.getCreditCard().matches(creditCardFormat)) {
				tmp[matches] = student;
				matches++;
			}
		}
		Student[] results = new Student[matches];
		if (matches >= 0)
			System.arraycopy(tmp, 0, results, 0, matches);
		return results;
	}
}