package myThirdJavaHomework;

public class UserManager {
	
	public void signIn(User user) {
		System.out.println(user.getEmail() +  " baþarýlý bir þekilde giriþ yapýldý.");
	}
	
	public void signOut(User user) {
		System.out.println(user.getEmail() + " çýkýþ yapýldý.");
	}

}
