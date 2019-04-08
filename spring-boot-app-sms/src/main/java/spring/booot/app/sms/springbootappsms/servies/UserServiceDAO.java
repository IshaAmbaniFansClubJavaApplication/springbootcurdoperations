package spring.booot.app.sms.springbootappsms.servies;

import org.springframework.stereotype.Service;

@Service
public interface UserServiceDAO {
	public void userUpdate(String firstName,Long id);

}
