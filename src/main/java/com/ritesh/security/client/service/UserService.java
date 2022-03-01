package com.ritesh.security.client.service;



import com.ritesh.security.client.entity.User;
import com.ritesh.security.client.entity.VerificationToken;
import com.ritesh.security.client.model.UserModel;

import java.util.Optional;

/**
 * The interface User service.
 */
public interface UserService {
    /**
     * Register user user.
     *
     * @param userModel the user model
     * @return the user
     */
    User registerUser(UserModel userModel);

    /**
     * Save verification token for user.
     *
     * @param token the token
     * @param user  the user
     */
    void saveVerificationTokenForUser(String token, User user);

    /**
     * Validate verification token string.
     *
     * @param token the token
     * @return the string
     */
    String validateVerificationToken(String token);

    /**
     * Generate new verification token verification token.
     *
     * @param oldToken the old token
     * @return the verification token
     */
    VerificationToken generateNewVerificationToken(String oldToken);

    /**
     * Find user by email user.
     *
     * @param email the email
     * @return the user
     */
    User findUserByEmail(String email);

    /**
     * Create password reset token for user.
     *
     * @param user  the user
     * @param token the token
     */
    void createPasswordResetTokenForUser(User user, String token);

    /**
     * Validate password reset token string.
     *
     * @param token the token
     * @return the string
     */
    String validatePasswordResetToken(String token);

    /**
     * Gets user by password reset token.
     *
     * @param token the token
     * @return the user by password reset token
     */
    Optional<User> getUserByPasswordResetToken(String token);

    /**
     * Change password.
     *
     * @param user        the user
     * @param newPassword the new password
     */
    void changePassword(User user, String newPassword);

    /**
     * Check if valid old password boolean.
     *
     * @param user        the user
     * @param oldPassword the old password
     * @return the boolean
     */
    boolean checkIfValidOldPassword(User user, String oldPassword);
}
