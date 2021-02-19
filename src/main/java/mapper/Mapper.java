package mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Mapper {
    @Select("select * from member")
    List<String> select();

    @Insert("insert into member(name) values('Lee')")
    void insert();
    @Insert("insert into member(name) values('Park')")
    void insert2();

    @Update("update member set name='wonjong' where name = 'park'")
    void update();

    @Delete("Delete from member where name = 'park'")
    void delete();
}
