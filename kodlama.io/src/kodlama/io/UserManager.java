package kodlama.io;

public class UserManager {
	
	public UserManager() {
		
	}
	public void add(User user) {
		System.out.println(user.getId() + " id'sine sahip " + user.getName() + " "+  user.getLastName() + " ��rencisi programa eklendi.");
	}

}
