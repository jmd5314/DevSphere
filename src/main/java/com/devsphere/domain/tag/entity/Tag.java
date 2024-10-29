package com.devsphere.domain.tag.entity;

import com.devsphere.domain.core.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "tag")
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 생성자를 통해 값 변경 목적으로 접근하는 메세지들 차단
public class Tag extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;


}