package spring.booot.app.sms.springbootappsms.exception;

public class UserNotFoundException extends Exception{
 public UserNotFoundException(String string) {
	System.out.println("please enter the valid user_id !!!");
}
}
