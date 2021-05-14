package kodlama.io;

public class Student extends User{
   String creditCardNumber;
   String adres;
   
   //Constructor
   public Student(){
	   
   }
   
   public Student(int id, String name, String lastName, String email, String password, String course,
		String creditCardNumber, String adres) {
	super(id, name, lastName, email, password, course);
	this.creditCardNumber = creditCardNumber;
	this.adres = adres;
}

   //Getter-Setter
public String getCreditCardNumber() {
	return creditCardNumber;
}

public void setCreditCardNumber(String creditCardNumber) {
	this.creditCardNumber = creditCardNumber;
}

public String getAdres() {
	return adres;
}

public void setAdres(String adres) {
	this.adres = adres;
}

}
