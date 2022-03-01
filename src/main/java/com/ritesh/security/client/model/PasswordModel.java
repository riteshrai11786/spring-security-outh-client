package com.ritesh.security.client.model;

import lombok.Data;

/**
 * The type Password model.
 */
@Data
public class PasswordModel {

    private String email;
    private String oldPassword;
    private String newPassword;
}