package com.clone.instagram.instafeedservice.payload;

import com.clone.instagram.instafeedservice.messaging.PostEventType;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class PostEventPayload {

    private String id;
    private Instant createdAt;
    private Instant updatedAt;
    private String username;
    private String lastModifiedBy;
    private String imageUrl;
    private String caption;
    private PostEventType eventType;

}
