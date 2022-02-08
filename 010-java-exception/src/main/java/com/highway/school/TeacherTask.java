package com.highway.school;

class BookNotFoundException extends Exception{
	
	
	private static final long serialVersionUID = 1L;

	public BookNotFoundException(String message) {
		super(message);
	}
}


public class TeacherTask {
	
	public void  teachClass(int status) throws BookNotFoundException{
		boolean book = getBook(status);
		
			if(!book) {
				throw new BookNotFoundException("Sorry i can't find book.");
			}else {
				readBook();
				explainContents();
			}
	}
	
	private boolean getBook(int status) {
		if(status >0) {
			return true;
		}
		return false;
	}
	private void readBook() {
		System.out.println("Teacher reading book.");
	}
	private void explainContents() {
		System.out.println("Teacher Explain Lesson book.");
	}
	
	public static void main(String[] args) {
		try {
			new TeacherTask().teachClass(-1);
		} catch (BookNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
