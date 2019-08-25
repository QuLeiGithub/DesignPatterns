package cn.tpson.springbootmybatis.pojo;



import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Account {
    private int id;
    private String loginName;
    private String password;
    private String nickName;
    private int age;
    private String location;
}
