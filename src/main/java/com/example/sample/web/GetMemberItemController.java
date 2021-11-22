package com.example.sample.web;

import com.example.sample.service.impl.FindMemberItemUseCase;
import com.example.sample.service.model.MemberItemResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 회원 정보를 조회한다.
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/member")
public class GetMemberItemController {

    final private  FindMemberItemUseCase findMemberItemUseCase;

    /**
     * 회원 아이템 정보를 memberId로 조회한다.
     * @param memberId 회원 ID
     * @return 회원 아이템 정보를 반환한다.
     */
    @GetMapping("/item/{memberId}")
    public MemberItemResponse getMemberItem(@PathVariable("memberId") final String memberId) {
        return findMemberItemUseCase.findMemberItem(memberId);
    }

}
