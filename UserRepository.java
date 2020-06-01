package jp.co.internous.ecsite.model.dao;

import java.util.List;

public interface UserRepository extends JpaRepository<user, Long> {
	
	List<user> findByUserNameAndPassword(String userName, String password);

}
