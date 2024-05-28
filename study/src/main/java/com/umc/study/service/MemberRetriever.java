package com.umc.study.service;

import com.umc.study.common.dto.ErrorMessage;
import com.umc.study.domain.Member;
import com.umc.study.exception.NotFoundException;
import com.umc.study.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberRetriever {

  private MemberRepository memberRepository;

  public Member findById(final long id) {
    return memberRepository.findById(id).orElseThrow(
        () -> new NotFoundException(ErrorMessage.MEMBER_NOT_FOUND_BY_ID_EXCEPTION));
  }
}
