/**
 * 
 */
package com.tnsif.exceptionhandling;

/**
 * @author Sagar
 *
 */
public class StudentService {
	
	 public void setMarks(Student student, int[] marks) throws InvalidMarksException {
	        for (int mark : marks) {
	            if (mark < 0 || mark > 100) {
	                throw new InvalidMarksException("Invalid marks found: " + mark + ". Marks should be between 0 and 100.");
	            }
	        }
	        student.setMarks(marks);
	    }

}
