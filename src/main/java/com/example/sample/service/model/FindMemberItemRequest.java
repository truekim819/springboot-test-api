package com.example.sample.service.model;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

/**
 * Item 조회 요청 모델
 */
@Data
@Getter
public class FindMemberItemRequest {

    final private String memberId;

    /**
     * Item리스트를 찾기 위한 조회키
     * @param memberId 회원 ID
     */
    public FindMemberItemRequest(@NonNull final String memberId) {
        this.memberId = memberId;
    }
}
