package com.ritesh.security.client.reporsitory;

import com.ritesh.security.client.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface User reporsitory.
 */
@Repository
public interface UserReporsitory extends JpaRepository<User, Long> {
    /**
     * Find by email user.
     *
     * @param email the email
     * @return the user
     */
    User findByEmail(String email);
}
