package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteAggregate Class<br>
 * Aggregateの実装クラス、createIderator()で独自のIderatorを
 * 返し、いろいろな処理を行う<br>
 * StudentをListで持つ
 * @author tukasa
 */
class ListsStudent {
	private List<Student> students = new ArrayList<>();
	
	/**
	 * List<Student>に入れるためのメソッド
	 * 
	 * @param s　Student...
	 * @return this 自身を返す 
	 */
	ListsStudent addStudent(Student... s) {
		for(Student student : s) {
			students.add(student);
		}
		return this;
	}
	
	/**
	 * Listを返す
	 * @return students List<Student>を返す
	 */
	List<Student> getStudents(){
		return this.students;
	}
	
	/**
	 * 独自のIderatorを返す
	 * @return ListsIterator(students) 独自のIderatorを返す
	 */
	Iterator createIterator() {
		return new ListsIterator(students);
	}
	
	/**
	 * 名前 ： Curriculum Score　をコンソール上に表示する
	 * @param cu 表示するCurriculum
	 */
	void printAll(Student.Curriculum cu) {
		System.out.printf("-----ListsStudent.printAll-----%n"
				+ "     ( Name : %s Score )%n", cu); 
		students.stream()
			.map(n -> n.getName() + " : " + n.getScore(cu))
			.forEach(System.out::println);
		System.out.println();
	}
}