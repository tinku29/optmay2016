package InterfaceAssignment;

public class NYU implements University{
	public int number=50;
	public void electricalDept(){
		System.out.println("In NYU electrical dept has 40 students");
	}

	@Override
	public void computerScience() {
		System.out.println("The number of students studying at NYU computer science Dept are " +number);
		
		
		
	}

	@Override
	public void administrativeDept() {
		
		
	}

	@Override
	public void mechanicalDept() {
		
		
	}

	@Override
	public String toString() {
		return "NYU [number=" + number + "]";
	}
	

}
