package spring.booot.app.sms.springbootappsms.servies;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceDAOImpl implements UserServiceDAO{
	
	@Autowired
	private UserServiceDAO  userServiceDAO;

	@Override
	public void userUpdate(String firstName,Long id) {
		
		String updateUser = "UPDATE User u set u.userFirstName=:firstname where u.userId:id";
		Query updateUserData = null;
		
	}
	
	

}
