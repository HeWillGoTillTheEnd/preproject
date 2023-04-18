package seb43_pre_027.demo.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberResponseDto {
    private long memberId;
    private String name;

    private String email;
}
