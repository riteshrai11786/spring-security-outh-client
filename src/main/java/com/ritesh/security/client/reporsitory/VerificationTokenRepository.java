package com.ritesh.security.client.reporsitory;

import com.ritesh.security.client.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Verification token repository.
 */
@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken,Long> {
    /**
     * Find by token verification token.
     *
     * @param token the token
     * @return the verification token
     */
    VerificationToken findByToken(String token);
}
