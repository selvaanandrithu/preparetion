package preparation;

public class UseLogin {

	public static void main(String[] args) throws PasswordException {
		String a = "selva";

		Login v = new Login();
		v.checkPassword(a);
	}

}
