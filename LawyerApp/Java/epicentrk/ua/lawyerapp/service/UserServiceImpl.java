package epicentrk.ua.lawyerapp.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import epicentrk.ua.lawyerapp.dao.RoleDao;
import epicentrk.ua.lawyerapp.dao.UserDao;
import epicentrk.ua.lawyerapp.model.Role;
import epicentrk.ua.lawyerapp.model.User;

/**
 * Implementation of {@link UserService} interface
 * 
 * @author Laschuk Oleksandr
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private RoleDao roleDao;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		Set<Role> roles = new HashSet<>();
		roles.add(roleDao.getOne(1L));
		user.setRoles(roles);
		userDao.save(user);

	}

	public User findByUserName(String username) {
		return userDao.findByUserName(username);
	}

}
