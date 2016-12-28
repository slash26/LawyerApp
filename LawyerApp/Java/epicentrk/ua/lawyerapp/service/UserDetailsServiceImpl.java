package epicentrk.ua.lawyerapp.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import epicentrk.ua.lawyerapp.dao.UserDao;

public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserDao userDao;

	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		epicentrk.ua.lawyerapp.model.User user = userDao.findByUserName(username);
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

		return null;
	}

}
