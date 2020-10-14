package com.example.provider;

import com.example.provider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author YUEXINGZHONG  2020/10/14 17:07
 * @version V1.0.0
 */
@Repository
public interface UserRespository extends JpaRepository<User, Long> {
}
