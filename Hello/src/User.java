import java.util.List;
import java.util.Objects;

public abstract class User {
	public String major;
	private String firstName;
	private String lastName;

	public User(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
	
	public final void sayHello() {

		System.out.println(firstName+" "+lastName);
	}
	
	

}
