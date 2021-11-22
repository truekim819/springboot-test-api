package com.example.sample.service.model;

import lombok.Getter;

/**
 * 회원 조회 아이템 반환 객체
 */
@Getter
public class MemberItemResponse {

    final private long memberNo;
    final private String name;
    final private String phone;

    /**
     * 회원 조회 아이템을 반환합니다.
     * @param memberNo 회원번호
     * @param name     회원이름
     * @param phone    전화번호
     */
    public MemberItemResponse(final long memberNo,
                              final String name,
                              final String phone) {
        this.memberNo = memberNo;
        this.name = name;
        this.phone = phone;
    }
}
