package com.yuqn.serverImpl;

import com.yuqn.entity.Student;
import com.yuqn.server.StudentServer;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;


/*
* @Component：存放到容器中
* @DubboService：注解设置暴露接口设置
*   interfaceClass：表示暴露接口
*   version：版本号
*   timeout：请求时间
* */
@Component
@DubboService(interfaceClass = StudentServer.class,version = "1.0")
public class StudentServerImpl implements StudentServer {
    @Override
    public Student selStu(Integer id) {
        switch (id){
            case 1:
                return new Student(id,"yuqn1","男");
            case 2:
                return new Student(id,"yuqn2","男");
            default:
                return new Student(id,"yuqn3","男");
        }
    }
}
