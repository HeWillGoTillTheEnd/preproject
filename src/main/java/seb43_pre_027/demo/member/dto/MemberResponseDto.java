package seb43_pre_027.demo.member.dto;

import lombok.Data;

@Data
public class MemberResponseDto {
    private long memberId;
    private String name;

    private String email;
}
