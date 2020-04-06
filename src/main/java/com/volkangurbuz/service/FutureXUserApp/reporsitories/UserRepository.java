package com.volkangurbuz.service.FutureXUserApp.reporsitories;

import com.volkangurbuz.service.FutureXUserApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface UserRepository extends JpaRepository<User, BigInteger> {

    List<User> findBycourseid(BigInteger id);

    User findByfirstname(String firstname);

    User findByuserid(BigInteger userid);

}
