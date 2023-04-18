package seb43_pre_027.demo.member.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import seb43_pre_027.demo.audit.Auditable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Member extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false, updatable = false)
    private String nickName;
    @Column(nullable = false, updatable = false, unique = true)
    private String email;

    @Column(nullable = false, updatable = false)
    private String password;

}

