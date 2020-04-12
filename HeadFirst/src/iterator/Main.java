package iterator;

import iterator.Student.Curriculum;

/**
 * Main Class<br>
 * 独自のInterface Iteratorを実装し、配列とリストを操作する
 * 
 * @author tukasa
 *
 */
class Main {

	public static void main(String[] args) {
		Student student1 = new Student()
			.setScore(Curriculum.NATIONAL_LANGUAGE, 85)
			.setScore(Curriculum.MATH, 100)
			.setScore(Curriculum.SOCIETY, 30);

		Student student2 = Student.create();
		Student student3 = Student.create();
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		// List<Student>を作成 
		ListsStudent listsStudents = new ListsStudent()
				.addStudent(student1, student2, student3);
		listsStudents.printAll(Curriculum.MATH);
		

		// Student[]を作成
		ArraysStudent arraysStudents = new ArraysStudent()
				.addStudent(student1, student2, student3,
					Student.create(), Student.create());
		arraysStudents.printAll(Curriculum.MATH);
		
		// 合計を表示するクラスを作成
		SumScore sumScore = new SumScore(arraysStudents, listsStudents);
		sumScore.printSum(Curriculum.MATH);

	}
}