package net.jonghyun.api.member.service;

import net.jonghyun.api.member.domain.BmiDTO;
import net.jonghyun.api.member.domain.CalcDTO;
import net.jonghyun.api.member.domain.GradeDTO;
import net.jonghyun.api.member.domain.MemberDTO;

/**
 * packageName: net.jonghyun.api.member.service
 * fileName     : MemberService
 * author       : 전종현
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11        전종현       최초 생성
 */
//인터페이스는 객체가 아니기 땜에 아무것도 안 써줌
public interface MemberService {
    String calc(CalcDTO calc);

    String bmi(BmiDTO bmi);

    String grade(GradeDTO grade);
}
