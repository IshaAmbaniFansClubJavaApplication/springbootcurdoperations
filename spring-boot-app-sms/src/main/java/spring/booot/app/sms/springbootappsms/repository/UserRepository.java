package spring.booot.app.sms.springbootappsms.repository;

import java.io.PrintWriter;
import java.util.List;
import org.springframework.data.repository.query.Param;

import javax.servlet.GenericServlet;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.transaction.Transactional;
import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.booot.app.sms.springbootappsms.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	/*// here by using Query annotation 
	 * @Query("Select u from User u  where u.userId=?")
	public List<User> getUserDetail(long id);
	*/
	@Query("Select u from User u  where u.userId=?")
	public List<User> getUserDetail(@Param("id")  final long id);
	//update the user details of the application
	//   @Query("UPDATE Company c SET c.address = :address WHERE c.id = :companyId")
	// update user_info set USER_FIRST_NAME='Manoj' where user_id=1001;
	/*@Query("UPDATE User u set u.userFirstName=:firstname  where u.userId=:id")*/
	/*@Query("UPDATE User u set u.userFirstName=:#{#firstname}  where u.userId=:#{#id}")
	public void updateUserData(@Param("firstname") String firstname ,@Param("id") long id);
	@Modifying
@Transactional
@Query("UPDATE Admin SET firstname = :firstname, lastname = :lastname, login = :login, superAdmin = :superAdmin, preferenceAdmin = :preferenceAdmin, address =  :address, zipCode = :zipCode, city = :city, country = :country, email = :email, profile = :profile, postLoginUrl = :postLoginUrl WHERE id = :id")
public void update(@Param("firstname") String firstname, @Param("lastname") String lastname, @Param("login") String login, @Param("superAdmin") boolean superAdmin, @Param("preferenceAdmin") boolean preferenceAdmin, @Param("address") String address, @Param("zipCode") String zipCode, @Param("city") String city, @Param("country") String country, @Param("email") String email, @Param("profile") String profile, @Param("postLoginUrl") String postLoginUrl, @Param("id") Long id);
	@Query("UPDATE User u set u.userFirstName=:#{#firstname}  where u.userId=:#{#id}")
	
	
*/	
	@Modifying
	@Transactional
	@Query("UPDATE User u set u.userFirstName=:firstname  where u.userId=:id")
	public void updateUserData(@Param("firstname") String firstname ,@Param("id") long id);

	// delete user based on the userID
	//delete from USER_INFO where user_id=1001;
	@Modifying
	@Transactional
	@Query("delete from User uf where uf.userId=:id ")
	public void deleteUserById(@Param(value="id") long id);
	
	
	/*
	@Repository
	public interface CompanyRepository extends JpaRepository<Company, Integer> {
	    @Modifying(clearAutomatically = true)
	    @Query("UPDATE Company c SET c.address = :address WHERE c.id = :companyId")
	    int updateAddress(@Param("companyId") int companyId, @Param("address") String address);
	}
	*/

}
 