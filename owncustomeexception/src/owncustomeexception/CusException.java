package owncustomeexception;

public class CusException {
	public void happen() throws YouCantAccess {
		System.out.println("Hello");
		throw new YouCantAccess("you cant access");
	}

	public static void main(String[] args) {
		CusException cusException = new CusException();
		try {
			cusException.happen();
		} catch (YouCantAccess e) {
			System.out.println(e.message);
		}
	}
}