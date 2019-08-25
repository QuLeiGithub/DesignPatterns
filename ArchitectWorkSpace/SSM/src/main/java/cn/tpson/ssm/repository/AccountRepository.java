package cn.tpson.ssm.repository;

import cn.tpson.ssm.pojo.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Integer> {

}
