package org.owasp.webgoat.plugin;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author nbaars
 * @since 8/20/17.
 */
@Builder
@Data
public class Email implements Serializable {

    private LocalDateTime time;
    private String contents;
    private String sender;
    private String title;
    private String recipient;
}