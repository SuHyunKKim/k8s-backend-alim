package com.welab.k8sbackendalim.event.consumer.message.user;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SiteUserInfoEvent {

    public static final String Topic = "userinfo";

    private String action;
    private String userId;
    private String phoneNumber;
    private LocalDateTime eventTime;

}
