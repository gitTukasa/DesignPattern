package iterator;

import iterator.Student.Curriculum;

/**
 * Iteratorを利用する Class<br>
 * List<String>, Student[]を使用し、合計を返す
 * @author tukasa
 *
 */
class SumScore {
	ArraysStudent arraysStudent;
	ListsStudent listsStudent;

	public SumScore(ArraysStudent arraysStudent,
			ListsStudent listsStudent) {
		this.arraysStudent = arraysStudent;
		this.listsStudent = listsStudent;
	}
	
	/**
	 * printSum(Curriculum cu) HelperMethod
	 * iteratorを作成し、合計の計算を行うMethodを呼び出す
	 * @param cu 合計したい科目
	 */
	void printSum(Curriculum cu) {
		Iterator arraysIterator = arraysStudent.createIterator();
		printSum(arraysIterator, cu);
		
		Iterator listsIterator = listsStudent.createIterator();
		printSum(listsIterator, cu);
	}
	
	/**
	 * printSum(Iterotor iterator, Curriculum cu) Method<br>
	 * Iteratorを利用し、Studentsの選択科目の合計をコンソール上に表示する
	 * @param iterator HelperMethodで作成したiterator
	 * @param cu 合計したい科目
	 */
	void printSum(Iterator iterator, Curriculum cu) {
		int sum = 0;
		while(iterator.hasNext()) {
			Student student = (Student)iterator.next(); 
			sum += student.getScore(cu);
		}
		System.out.println(iterator.getClass().getSimpleName()
				+ " " + cu.getName() + " : " + sum);
	}
	

	/*
	 * Iterator　を実装しないとListと配列の２種類のMethodが必要
	 * になる
	 *
	 *	void printSum(List<Student> list, Student.Curriculum cu) {
	 *		final int SUM = list.stream()
	 *			.mapToInt(s -> s.getScore(cu))
	 *			.sum();
	 *		System.out.println("-----Sum-----");
	 *		System.out.println(cu.getName() + " : " + SUM);
	 *	}
	 */
}
