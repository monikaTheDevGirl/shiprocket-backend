package in.rakuten.shiprocket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.rakuten.shiprocket.model.User;
import in.rakuten.shiprocket.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> getAllUsers() {
		List<User> allUsers = userRepository.findAll();

		return allUsers;
	}

	public void createUser(User user) {
		userRepository.save(user);
	}

	public User getUserById(Integer id) {
		return (User) userRepository.getById(id);
	}

	public void deleteUserById(Integer id) {
		userRepository.deleteById(id);
	}

	public void updateUser(User user) {
		userRepository.save(user);
	}
}
