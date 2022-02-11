package net.jonghyun.api.buy.domain;

/**
 * packageName: net.jonghyun.api.buy.domain
 * fileName     : BuyDTO
 * author       : 전종현
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11        전종현       최초 생성
 */
public class BuyDTO {
    private int num;
    private String mem_Id;
    private String prod_Name;
    private String group_Name;
    private int amount;

    private static final BuyDTO buyDTO = new BuyDTO();
    public BuyDTO(){}
    public static BuyDTO getInstance(){return buyDTO;}

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMem_Id() {
        return mem_Id;
    }

    public void setMem_Id(String mem_Id) {
        this.mem_Id = mem_Id;
    }

    public String getProd_Name() {
        return prod_Name;
    }

    public void setProd_Name(String prod_Name) {
        this.prod_Name = prod_Name;
    }

    public String getGroup_Name() {
        return group_Name;
    }

    public void setGroup_Name(String group_Name) {
        this.group_Name = group_Name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
