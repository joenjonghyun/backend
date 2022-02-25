package net.jonghyun.api.member.service;

import lombok.RequiredArgsConstructor;
import net.jonghyun.api.member.domain.BmiDTO;
import net.jonghyun.api.member.domain.CalcDTO;
import net.jonghyun.api.member.domain.GradeDTO;
import net.jonghyun.api.member.domain.MemberDTO;
import net.jonghyun.api.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

/**
 * packageName: net.jonghyun.api.member.service
 * fileName     : MemberServiceImpl
 * author       : 전종현
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11        전종현       최초 생성
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository repository;
    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;

        switch (calc.getOpcode()){
            case "+" : res = a + b; break;
            case "-" : res = a - b; break;
            case "*" : res = a * b; break;
            case "/" : res = a / b; break;
            case "%" : res = a % b; break;
        }
        return String.format("%d %s %d= %d", a, calc.getOpcode(), b, res);
    }

    @Override
    public String bmi(BmiDTO bmi) {
        return repository.bmi(bmi);
    }

    @Override
    public String grade(GradeDTO grade) {
        return repository.grade(grade);
    }
}
