package com.devsphere.domain.user.entity;

import com.devsphere.domain.core.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 생성자를 통해 값 변경 목적으로 접근하는 메세지들 차단
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    private String name;

    private String nickname;

    @Enumerated(EnumType.STRING)
    private SocialType socialType;

    @Column(length = 50, nullable = false)
    private String socialId;

    @Enumerated(EnumType.STRING)
    private UserRole role;

}