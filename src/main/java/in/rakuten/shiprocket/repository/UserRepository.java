package in.rakuten.shiprocket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.rakuten.shiprocket.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

