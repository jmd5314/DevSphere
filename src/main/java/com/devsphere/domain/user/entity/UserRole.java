package com.devsphere.domain.user.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
// 스프링 시큐리티에는 권한 코드에 항상 "ROLE_" 접두사가 붙어야 한다!
public enum UserRole {
    USER("ROLE_USER"),
    GUEST("ROLE_GUEST"),
    ADMIN("ROLE_ADMIN");

    private final String key;
}