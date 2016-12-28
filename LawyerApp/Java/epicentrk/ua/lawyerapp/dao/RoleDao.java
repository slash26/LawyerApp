package epicentrk.ua.lawyerapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import epicentrk.ua.lawyerapp.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {

}
