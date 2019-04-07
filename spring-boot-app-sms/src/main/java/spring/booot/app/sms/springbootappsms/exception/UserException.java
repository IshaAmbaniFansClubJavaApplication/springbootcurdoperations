package spring.booot.app.sms.springbootappsms.exception;

public class UserException extends Exception{
	
	public UserException(long id) {
		System.out.println("id not found ");
	}
	public UserException(long id,String name) {
		System.out.println("id and name not found ");
	}
	
	public UserException(long id,String name,Throwable t) {
		System.out.println("please enter the data in corrent  ");
	}
}
