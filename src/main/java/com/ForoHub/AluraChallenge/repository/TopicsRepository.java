package com.ForoHub.AluraChallenge.repository;


import com.ForoHub.AluraChallenge.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;


@Repository
public interface TopicsRepository extends JpaRepository<Topic, Long>{
    UserDetails findByid(Long id);
}
