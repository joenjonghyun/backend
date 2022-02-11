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
    String mem_Id(MemberDTO memberDTO);
    String mem_Name(MemberDTO memberDTO);
    String mem_Number(MemberDTO memberDTO);
    String address(MemberDTO memberDTO);
    String phone1(MemberDTO memberDTO);
    String phone2(MemberDTO memberDTO);
    String height(MemberDTO memberDTO);
    String debut_Date(MemberDTO memberDTO);
}
