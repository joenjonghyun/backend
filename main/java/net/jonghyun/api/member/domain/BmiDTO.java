package net.jonghyun.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: net.jonghyun.api.member.domain
 * fileName     : BmiDTO
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
public class BmiDTO {
    private String name;
    private int height;
    private int weight;
}
