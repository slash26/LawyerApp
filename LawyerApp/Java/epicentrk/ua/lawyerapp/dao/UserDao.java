package epicentrk.ua.lawyerapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import epicentrk.ua.lawyerapp.model.User;

public interface UserDao extends JpaRepository<User, Long> {
	User findByUserName(String username);
}
