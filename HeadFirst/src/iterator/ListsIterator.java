package iterator;

import java.util.List;

class ListsIterator implements Iterator {
	private List<Student> students;
	private int position = 0;
	
	public ListsIterator(List<Student> students) {
		this.students = students;
	}

	@Override
	public boolean hasNext() {
		if (students.size() <= position
				|| students.get(position) == null){
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Student next() {
		Student student = students.get(position);
		position++;
		return student;
	}

}