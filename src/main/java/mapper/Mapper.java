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
    //anotation을 이용한 CRUD
    @Select("select * from member")
    List<Member> select();

    @Insert("insert into member(name, age) values(#{name}, #{age})")
    void insert(Member member);

    @Update("update member set age = #{age} where name = #{name} ")
    void update(Member member);

    @Delete("Delete from member where name = #{name}")
    void delete(Member member);
    //XML을 이용한 CRUD
    public List<Member> select2();
    void insert2(Member member);
}
