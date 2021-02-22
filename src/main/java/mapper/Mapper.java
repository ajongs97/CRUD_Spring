package mapper;

import controller.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Mapper {
    //XML을 이용한 CRUD
    public List<Member> select();
    void insert(Member member);
    void update(Member member);
    void delete(Member member);
}
