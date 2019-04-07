package spring.booot.app.sms.springbootappsms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.booot.app.sms.springbootappsms.entities.User;
import spring.booot.app.sms.springbootappsms.exception.UserNotFoundException;
import spring.booot.app.sms.springbootappsms.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	@RequestMapping("/usersave")
	public void userSave(@RequestBody  User user) {
		System.out.println("before Save");
		userRepository.save(user);
		System.out.println("after save");
	}
	
	@RequestMapping(value="/getuser/{id}" ,  method = RequestMethod.GET)
	/*public List<User> getUserDetails(@Valid @RequestParam(defaultValue="Ganesh") Long id){*/
	public List<User> getUserDetails(@PathVariable Long id) {
	//	int id=1001;
		System.out.println("getUserDetails Before");
		List<User> userDetail =userRepository.getUserDetail(id);
		/*try {
		List<User> userDetail =userRepository.getUserDetail(id);
		if(userDetail.isEmpty()) {
			System.out.println("if condition of the user related fetch the data based on the userId");
			
			throw new UserNotFoundException("id:"+id);
		}
		*/System.out.println("getUserDetails After");
		//}
	/*	catch(UserNotFoundException ex) {
			System.out.println();
			throw new UserNotFoundException("id:"+id);
		}
*/		return userDetail;
	}
	
	/*@RequestMapping(value="/getuserupdate" ,method = RequestMethod.PUT)
	public List<User> getUserUpdate(@PathVariable long id,@RequestBody User userData,@PathVariable String firstname){
		System.out.println("hi bean of the application ");
		long id =1001;
		String firstname = "Manoj";
*/	//	List<User> updateUserData = userRepository.updateUserData(firstname,id);
		//userRepository.findOne(userData)
		//System.out.println("user Updated");
		//System.out.println(updateUserData);
		
		//return updateUserData;
	//}
	
	// delete of the user based on the userId
	/*@RequestMapping(value="/userdelete" ,method = RequestMethod.DELETE)
	public void deleteUser() {
		long id=1001;
		List<User> deleteUSer = userRepository.deleteUserById(id);
		
	}
	*/
	
	// here we can't having the any dynamic values
	@RequestMapping(value="/value")
	public String getValues() {
		return "Hello";
	}
	//@RequestParam("userId") Integer userId)
	@RequestMapping(value="/values" )
	public String getDynamic(@RequestParam("username") String username) {
		System.out.println(username);
		return username;
	}
	@RequestMapping(value="/values/{username}" )
	public String getDynamicData(@RequestParam(value="username") String username) {
		System.out.println(username);
		return username;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
