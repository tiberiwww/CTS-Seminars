package s;

public interface IUser {
	
	public boolean login(String username, String password);
	public boolean register(String username, String email, String password);
	public boolean SendEmail(String content);
	public void LogError(String errorContent);
	
	

}
