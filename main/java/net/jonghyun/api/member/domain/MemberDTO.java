package net.jonghyun.api.member.domain;

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
public class MemberDTO {
    private String mem_Id;
    private String mem_Name;
    private int men_Number;
    private String address;
    private String phone1;
    private String phone2;
    private int height;
    private String debut_Date;

    private final static MemberDTO memberDTO = new MemberDTO();
    public MemberDTO(){}
    public static MemberDTO getInstance(){return memberDTO;}

    public String getMem_Id() {
        return mem_Id;
    }

    public void setMem_Id(String mem_Id) {
        this.mem_Id = mem_Id;
    }

    public String getMem_Name() {
        return mem_Name;
    }

    public void setMem_Name(String mem_Name) {
        this.mem_Name = mem_Name;
    }

    public int getMen_Number() {
        return men_Number;
    }

    public void setMen_Number(int men_Number) {
        this.men_Number = men_Number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDebut_Date() {
        return debut_Date;
    }

    public void setDebut_Date(String debut_Date) {
        this.debut_Date = debut_Date;
    }
}
