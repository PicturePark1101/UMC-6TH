package com.umc.study.repository;

import com.umc.study.domain.Member;
import com.umc.study.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
