package controller;

import mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    Mapper mapper;

    @ResponseBody
    @RequestMapping(value="/select")
    public List<String> select(){
        return mapper.select();
    }

    @ResponseBody
    @RequestMapping(value="/insert")
    public List<String> insert(){
        mapper.insert();
        return mapper.select();
    }
    @ResponseBody
    @RequestMapping(value="/insert2")
    public List<String> insert2(){
        mapper.insert2();
        return mapper.select();
    }
    @ResponseBody
    @RequestMapping(value="/insert3/{name}", method = RequestMethod.GET)
    public List<String> insert3(@PathVariable String name){
        mapper.insert3(name);
        return mapper.select();
    }

    @ResponseBody
    @RequestMapping(value="/update")
    public List<String> update(){
        mapper.update();
        return mapper.select();
    }

    @ResponseBody
    @RequestMapping(value="/delete")
    public List<String> delete(){
        mapper.delete();
        return mapper.select();
    }
}
