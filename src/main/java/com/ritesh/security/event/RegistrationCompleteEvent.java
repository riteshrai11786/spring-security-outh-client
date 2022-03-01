package com.ritesh.security.event;

import com.ritesh.security.client.entity.User;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * The type Registration complete event.
 */
@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent {

    private final User user;
    private final String applicationUrl;

    /**
     * Instantiates a new Registration complete event.
     *
     * @param user           the user
     * @param applicationUrl the application url
     */
    public RegistrationCompleteEvent(User user, String applicationUrl) {
        super(user);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }
}