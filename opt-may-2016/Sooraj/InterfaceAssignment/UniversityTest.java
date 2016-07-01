package InterfaceAssignment;

public class UniversityTest {

	public static void main(String[] args) {
		University uni=new Njit();
		uni.electricalDept();
		uni.computerScience();
		University ny=new NYU();
		ny.electricalDept();
		ny.computerScience();
		System.out.println(ny.toString());

	}

}
