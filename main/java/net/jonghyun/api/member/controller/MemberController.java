package net.jonghyun.api.member.controller;

import lombok.RequiredArgsConstructor;
import net.jonghyun.api.member.domain.BmiDTO;
import net.jonghyun.api.member.domain.CalcDTO;
import net.jonghyun.api.member.domain.GradeDTO;
import net.jonghyun.api.member.domain.MemberDTO;
import net.jonghyun.api.member.repository.MemberRepository;
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
@RequestMapping("/member")
public class MemberController {
    private final MemberService service;
    @PostMapping("/bmi")
    public String bmi(@RequestBody BmiDTO bmi) {
        return service.bmi(bmi);
    }
    @PostMapping("/calc")
    public String calc(@RequestBody CalcDTO calc) {
        return service.calc(calc);
    }
    @PostMapping("/grade")
    public String grade(@RequestBody GradeDTO grade){
        return service.grade(grade);
    }
}

