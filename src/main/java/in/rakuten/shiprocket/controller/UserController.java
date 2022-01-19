package in.rakuten.shiprocket.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.rakuten.shiprocket.model.User;
import in.rakuten.shiprocket.service.UserService;



@RestController
public class UserController{
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllMyUsers() {
		List<User> allUsers = userService.getAllUsers();
		
		return allUsers;
	}
	
	@GetMapping("/user/{user_id}")
	public User getUserById(@PathVariable("user_id") Integer userId) {
		return userService.getUserById(userId);
	}
	
	
	@PostMapping("/create-user")
	public void createUser(@RequestBody User user) {
		userService.createUser(user);
	}
	
	@PostMapping("/update-user")
	public void updateUser (@RequestBody User user) {
		userService.updateUser(user);
	}
	
	@DeleteMapping("/delete-user/{user_id}")
	public void deleteUser(@PathVariable("user_id") Integer userId) {
		
		userService.deleteUserById(userId);
	}
	
}

