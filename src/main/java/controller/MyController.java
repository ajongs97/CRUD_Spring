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
    @RequestMapping(value="/select2")
    public List<Member> select2(){
        return mapper.select2();
    }

    @ResponseBody
    @RequestMapping(value="/insert", produces = "application/json; charset=utf8", method = RequestMethod.POST)
    public String insert(@RequestBody Member member){
        mapper.insert(member);
        return member.getName() + " 데이터 추가완료";
    }

    @ResponseBody
    @RequestMapping(value="/insert2", produces = "application/json; charset=utf8", method = RequestMethod.POST)
    public String insert2(@RequestBody Member member){
        mapper.insert2(member);
        return member.getName() + " 데이터 추가완료";
    }

    @ResponseBody
    @RequestMapping(value="/update", produces = "application/json; charset=utf8", method = RequestMethod.PUT)
    public String update(@RequestBody Member member){
        mapper.update(member);
        return member.getName() + " update";
    }
    @ResponseBody
    @RequestMapping(value="/update2", produces = "application/json; charset=utf8", method = RequestMethod.PUT)
    public String update2(@RequestBody Member member){
        mapper.update2(member);
        return member.getName() + " update";
    }

    @ResponseBody
    @RequestMapping(value="/delete", produces = "application/json; charset=utf8", method = RequestMethod.DELETE)
    public String delete(@RequestBody Member member){
        mapper.delete(member);
        return "delete " + member.getName();
    }
    @ResponseBody
    @RequestMapping(value="/delete2", produces = "application/json; charset=utf8", method = RequestMethod.DELETE)
    public String delete2(@RequestBody Member member){
        mapper.delete2(member);
        return "delete " + member.getName();
    }
}
