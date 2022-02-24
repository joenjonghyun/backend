package net.jonghyun.api.member.controller;

import lombok.RequiredArgsConstructor;
import net.jonghyun.api.member.domain.MemberDTO;
import net.jonghyun.api.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName: net.jonghyun.api.table.controller
 * fileName     : TableController
 * author       : 전종현
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11        전종현       최초 생성
 */
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

    @GetMapping("/member/bmi/{username}/{height}/{weight}")
    public String getBmi(@PathVariable String username,
                         @PathVariable double height,
                         @PathVariable double weight) {
        System.out.println("리액트에서 넘어온 이름 :" + username);
        System.out.println("리액트에서 넘어온 키 :" + height);
        System.out.println("리액트에서 넘어온 무게 :" + weight);
        return "BMI 는 정상";
    }
}

