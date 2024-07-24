package com.JVREST.API.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.JVREST.API.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
