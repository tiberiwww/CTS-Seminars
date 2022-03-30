package builder_solved;

public class ProgMain {

	public static void main(String[] args) {
		
//		User u1=new User("tibi@gmail.com","tibi@gmail.com","tibi", "b","bucharest");
//		User u2=new User("tibi@gmail.com","tibi@gmail.com","tibi", "b","0740123456");
		
		User u= new User.UserBuilder("tibi@gmail.com","tibi@gmail.com","tibi", "b").address("Bucharest").build();
		User u2= new User.UserBuilder("tibi@gmail.com","tibi@gmail.com","tibi", "b").phone("0745678892").build();

	}
}
