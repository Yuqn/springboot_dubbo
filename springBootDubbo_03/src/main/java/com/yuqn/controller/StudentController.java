package com.yuqn.controller;

import com.yuqn.entity.Student;
import com.yuqn.server.StudentServer;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {

/*
* @DubboReference使用注解获取远程接口
* */
    @DubboReference(interfaceClass = StudentServer.class,version = "1.0")
    private StudentServer studentServer;

    @GetMapping(value = "/student/selStu/{id}")
    public String selStu(@PathVariable Integer id){
        Student student=studentServer.selStu(id);
        return student.toString();
    }
}
