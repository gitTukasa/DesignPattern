package iterator;

class ArraysIterator implements Iterator{
	private Student[] students;
	private int position = 0;
	
	public ArraysIterator(Student[] students) {
		this.students = students;
	}

	@Override
	public boolean hasNext() {
		if (position >= students.length
				|| students[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Student next() {
		Student student = students[position];
		position++;
		return student;
	}
}