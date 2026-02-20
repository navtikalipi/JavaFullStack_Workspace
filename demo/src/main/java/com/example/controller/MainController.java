package com.example.controller;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController //it exposes data and service in the form of JSON/XML
public class MainController {
    List<String> list=new ArrayList<>();
    public MainController(){
        list.add("Nav"); list.add("Nitish"); list.add("Virat"); list.add("Upasana");
    }


    //@GetMapping("/list")
    @RequestMapping(value = "/list", method=RequestMethod.GET) //by def GET
    public List<String> list(){
        return list;
    }

    @GetMapping("findOne/{index}")
    public String findOne(@PathVariable int index){
        return  list.get(index);
    }

    @PostMapping("/add")
    public void add(@RequestBody String name){
        //list.add("Ashim");
        list.add(name);

    }
    @PutMapping("/update/{index}")
    public void update(@PathVariable int index,@RequestBody String name ){
        list.set(index,name);
    }

    @DeleteMapping("/delete/{index}")
    public void delete(@PathVariable int index){
        list.remove(index);
    }



}
