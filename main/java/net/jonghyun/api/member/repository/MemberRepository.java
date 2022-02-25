package net.jonghyun.api.member.repository;

import net.jonghyun.api.member.domain.BmiDTO;
import net.jonghyun.api.member.domain.CalcDTO;
import net.jonghyun.api.member.domain.GradeDTO;


/**
 * packageName: net.jonghyun.api.member.repository
 * fileName     : MemberRepository
 * author       : 전종현
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11        전종현       최초 생성
 */

public interface MemberRepository {
    String calc(CalcDTO calc);

    String bmi(BmiDTO bmi);

    String grade(GradeDTO grade);
}
