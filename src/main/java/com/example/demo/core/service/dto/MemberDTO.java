package com.example.demo.core.service.dto;

import com.example.demo.core.security.Role;
import com.example.demo.core.entity.Member;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberDTO {

    private String id;
    private String userName;
    private String email;
    private Role role;

    public static MemberDTO of(Member member) {
        return MemberDTO.builder()
                .id(String.valueOf(member.getId()))
                .userName(member.getUsername())
                .email(member.getEmail())
                .role(Role.of(member.getRole()))
                .build();
    }
}