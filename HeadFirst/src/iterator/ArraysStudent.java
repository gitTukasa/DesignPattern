package iterator;

import java.io.IOException;
import java.util.Arrays;

/**
 * ConcreteAggregate Class<br>
 * Aggregateの実装クラス、createIderator()で独自のIderatorを
 * 返し、いろいろな処理を行う<br>
 * Studentを配列で持つ
 * @author tukasa
 */
class ArraysStudent {
	private final int MAX_SIZE = 5;	//最大サイズの定数
	private int currentNomber = 0;
	private Student[] students = new Student[MAX_SIZE];

	/**
	 * 配列に入れるためのヘルパーメソッド<br>
	 * @see {@link}addStudent(Student... s) 
	 */
	private int getCurrentNomber() {
		currentNomber = (int)Arrays.stream(students)
			.filter(i -> i != null)
			.count();
		return currentNomber;
	}
	
	/**
	 * Student[]に入れるためのメソッド、定数MAX_SIZEで最大サイズを
	 * 指定している
	 * 
	 * @param s　Student...
	 * @return this 自身を返す
	 * @exception e IOException() サイズを超過する場合
	 */
	ArraysStudent addStudent(Student... s) {
		getCurrentNomber();
		try {
			if (s.length > MAX_SIZE - currentNomber) {
				throw new IOException("入力された数が多すぎます");
			}

			for (int i = 0; i < s.length; i++) {
				students[currentNomber + i] = s[i];
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this;
	}

	/**
	 * 配列を返す
	 * @return students Students[]を返す
	 */
	Student[] getStudents() {
		return students;
	}

	/**
	 * 独自のIderatorを返す
	 * @return ArraysIterator(students) 独自のIderatorを返す
	 */
	Iterator createIterator() {
		return new ArraysIterator(students);
	}
	
	/**
	 * 名前 ： Curriculum Score　をコンソール上に表示する
	 * @param cu 表示するCurriculum
	 */
	void printAll(Student.Curriculum cu) {
		System.out.printf("-----ArraysStudent.printAll()-----%n"
				+ "     ( Name : %s Score )%n", cu); 
		Arrays.stream(students)
			.filter(n -> n != null)
			.map(n -> n.getName() + " : " + n.getScore(cu))
			.forEach(System.out::println);
		System.out.println();
	}
}