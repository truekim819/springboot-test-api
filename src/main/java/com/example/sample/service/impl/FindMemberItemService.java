package com.example.sample.service.impl;

import com.example.sample.service.model.MemberItemResponse;
import org.springframework.stereotype.Service;

@Service
public class FindMemberItemService implements FindMemberItemUseCase{

    @Override
    public MemberItemResponse findMemberItem(String memberId) {
        return new MemberItemResponse(1, "김테스터", "01012342730");
    }
}
