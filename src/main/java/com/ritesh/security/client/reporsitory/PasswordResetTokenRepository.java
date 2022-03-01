package com.ritesh.security.client.reporsitory;

import com.ritesh.security.client.entity.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Password reset token repository.
 */
@Repository
public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    /**
     * Find by token password reset token.
     *
     * @param token the token
     * @return the password reset token
     */
    PasswordResetToken findByToken(String token);
}
