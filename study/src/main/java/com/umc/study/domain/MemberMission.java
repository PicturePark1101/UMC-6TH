package com.umc.study.domain;

import com.umc.study.domain.enums.Gender;
import com.umc.study.domain.enums.MissionStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "member_id")
  private Member member;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "mission_id")
  private Mission mission;

  @Enumerated(EnumType.STRING)
  private MissionStatus status;

  private LocalDateTime expireDate;

  public static MemberMission create(Member member, Mission mission) {
    return MemberMission.builder()
        .member(member)
        .mission(mission)
        .build();
  }

  @Builder
  private MemberMission(Member member, Mission mission) {
    this.mission = mission;
    this.member = member;
    this.status = MissionStatus.ING;
    this.expireDate = LocalDateTime.MAX;
  }
}
