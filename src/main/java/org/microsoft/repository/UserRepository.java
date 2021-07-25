package org.microsoft.repository;

import org.microsoft.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** author @Santosh
*/

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
