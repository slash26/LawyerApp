package epicentrk.ua.lawyerapp.service;

import epicentrk.ua.lawyerapp.model.User;

/**
 * Service class {@link epicentrk.ua.lawyerapp.model.user})
 * 
 * @author Laschuk Oleksandr
 * @version 1.0
 * 
 */

public interface UserService {

	void save(User user);

	User findByUserName(String username);
}
