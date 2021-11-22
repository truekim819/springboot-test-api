package com.example.sample.service.impl;

import com.example.sample.service.model.MemberItemResponse;

public interface FindMemberItemUseCase {

    /**
     * item을 조회합니다.
     * @param memberId 회원 ID
     * @return 회원아이템 정보
     */
    MemberItemResponse findMemberItem(final String memberId);
}
