package seb43_pre_027.demo.member;

import org.springframework.data.jpa.repository.JpaRepository;
import seb43_pre_027.demo.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
