package net.jonghyun.api.member.service;

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
public interface MemberService {
    String Membershiplist();
    String Membershipinformation();
    String Checkthelist();
    String Registertosendemails();
    String Savingmoneylist();
    String Checkthedetailsofthesavings();
    String calc();
    String grade();
    String bmi();
}
