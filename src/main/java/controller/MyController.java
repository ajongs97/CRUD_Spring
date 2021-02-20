package controller;

import mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    Mapper mapper;

    @ResponseBody
    @RequestMapping(value="/select")
    public List<Member> select(){
        return mapper.select();
    }

    @ResponseBody
    @RequestMapping(value="/insert", produces = "application/json; charset=utf8", method = RequestMethod.POST)
    public String insert(@RequestBody Member member){
        mapper.insert(member);
        return member.getName() + " 데이터 추가완료";
    }

    @ResponseBody
    @RequestMapping(value="/update", produces = "application/json; charset=utf8", method = RequestMethod.PUT)
    public String update(@RequestBody Member member){
        mapper.update(member);
        return member.getName() + " update";
    }

    @ResponseBody
    @RequestMapping(value="/delete", produces = "application/json; charset=utf8", method = RequestMethod.DELETE)
    public String delete(@RequestBody Member member){
        mapper.delete(member);
        return "delete " + member.getName();
    }
}
