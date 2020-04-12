package iterator;

import java.util.Random;

/**
 * Student Class<br>
 * 他のクラスで操作を行う(合計や平均等を求める)
 * @author tukasa
 *
 */
class Student {
	private static int count = 1;
	private String name;	//名前
	private int nationalLanguageScore;	//国語
	private int mathScore;	//数学
	private int societyScore;	//社会
	
	public Student() {
		this.name = "Student" + count++;
	};

	/**
	 * create() static method<br>
	 * 名前を Student + No, ３教科の点数をランダムで生成する
	 * @return　student 生成した生徒
	 */
	static Student create() {
		Student student = new Student()
			.setScore(Curriculum.NATIONAL_LANGUAGE, new Random().nextInt(100))
			.setScore(Curriculum.MATH, new Random().nextInt(100))
			.setScore(Curriculum.SOCIETY, new Random().nextInt(100));
		return student;
	}
	
	/** Setter method<br> フィールドに名前を設定する */
	Student setName(String name) {
		this.name = name;
		return this;
	}
	
	/**
	 * Setter method<br>
	 * フィールドに選択した教科の点数を設定する
	 * @param cu 教科
	 * @param score 点数
	 * @return this 自分自身を返す
	 */
	Student setScore(Curriculum cu, int score) {
		switch(cu){
			case NATIONAL_LANGUAGE:
				this.nationalLanguageScore = score;
				break;
			case MATH:
				this.mathScore = score;
				break;
			case SOCIETY:
				this.societyScore = score;
		}
		return this;
	}
	
	
	/**
	 * Getter method<br>
	 * 名前を返す
	 * @return
	 */
	String getName() {
		return this.name;
	}
	
	/**
	 * Getter method<br>
	 * 選択科目の点数を返す
	 * @param cu 科目
	 * @return socre 選択した科目の点数 
	 */
	int getScore(Curriculum cu) {
		int score = -1;
		switch(cu){
			case NATIONAL_LANGUAGE:
				score = this.nationalLanguageScore;
				break;
			case MATH:
				score = this.mathScore; 
				break;
			case SOCIETY:
				score = this.societyScore; 
				break;
		}
		return score;
	}

	/**
	 * toString()<br>
	 * << STUDENT : s>><br>
	 *  国語 : x, 数学 : y, 社会 : z
	 *  @return String String.format
	 */
	@Override
	public String toString() {
		return String.format(
				"<< STUDENT : %s>>%n"
				+ "  国語 :%3d, 数学 :%3d, 社会 :%3d%n"
				,name,nationalLanguageScore,mathScore,societyScore);
	}

	static enum Curriculum{
		NATIONAL_LANGUAGE("国語", 0),
		MATH("数学", 1),
		SOCIETY("社会", 2);

		private String name;
		private int id;
		
		private Curriculum(String name, int id) {
			this.name = name;
			this.id = id;
		}
		
		String getName() {
			return this.name;
		}
		
		int getId() {
			return this.id;
		}
	};
}
