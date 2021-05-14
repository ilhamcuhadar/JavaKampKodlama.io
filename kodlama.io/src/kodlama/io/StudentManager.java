package kodlama.io;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getName() +  " "+  user.getLastName() + " added" );
	}
}
