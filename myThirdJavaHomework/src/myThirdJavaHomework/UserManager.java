package myThirdJavaHomework;

public class UserManager {
	
	public void signIn(User user) {
		System.out.println(user.getEmail() +  " ba�ar�l� bir �ekilde giri� yap�ld�.");
	}
	
	public void signOut(User user) {
		System.out.println(user.getEmail() + " ��k�� yap�ld�.");
	}

}
