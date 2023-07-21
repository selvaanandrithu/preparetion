package preparation;

public class Login {

	String password;

	public void checkPassword(String password) throws PasswordException {

		try {
			if (password.length() > 8) {
				System.out.println("Successfully Logined");
			} else {
				throw new PasswordException("failed");
			}
		} 
//		finally {
//			System.out.println("oye");
//		}
		catch (Exception e) {
			System.out.println(e + " hey no way");
			e.printStackTrace();
		}

	}

}
