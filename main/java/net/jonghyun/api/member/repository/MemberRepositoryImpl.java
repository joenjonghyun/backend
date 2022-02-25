package net.jonghyun.api.member.repository;

import lombok.RequiredArgsConstructor;
import net.jonghyun.api.member.domain.BmiDTO;
import net.jonghyun.api.member.domain.CalcDTO;
import net.jonghyun.api.member.domain.GradeDTO;
import net.jonghyun.api.member.service.MemberService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: net.jonghyun.api.member.repository
 * fileName     : MemberRepositoryImpl
 * author       : 전종현
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11        전종현       최초 생성
 */
@Repository
public class MemberRepositoryImpl implements MemberRepository {
    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String bmi(BmiDTO bmi) {
        return null;
    }

    @Override
    public String grade(GradeDTO grade) {
        return null;
    }
}
