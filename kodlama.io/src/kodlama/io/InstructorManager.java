package kodlama.io;

public class InstructorManager extends UserManager {
  public void add(User user) {
	  System.out.println(user.getName() +  " "+  user.getLastName() + " added" );
	
  }
}

