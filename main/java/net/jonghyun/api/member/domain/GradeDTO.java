package net.jonghyun.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: net.jonghyun.api.member.domain
 * fileName     : GradeDTO
 * author       : 전종현
 * date         : 2022-02-25
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-25        전종현       최초 생성
 */
@Data
@Component
public class GradeDTO {
    private String name;
    private int kr;
    private int en;
    private int math;
}
