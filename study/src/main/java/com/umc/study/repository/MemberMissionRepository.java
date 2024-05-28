package com.umc.study.repository;

import com.umc.study.domain.Member;
import com.umc.study.domain.MemberMission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberMissionRepository extends JpaRepository<MemberMission, Long> {

}
