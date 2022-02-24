package net.jonghyun.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: net.jonghyun.api.member.domain
 * fileName     : MemberDTO
 * author       : 전종현
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11        전종현       최초 생성
 */
@Data // 게터세터
@Component  //싱글턴
public class MemberDTO {
    private String mem_Id;
    private String mem_Name;
    private String address;
    private String phone;
    private double height;
    private double weight;
    private String debut_Date;
}

