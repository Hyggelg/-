package com.itheima.service;

import com.itheima.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/*部门管理*/

public interface DeptService {
    /**
     * 查询所有部门
     * @return
     */
    List<Dept> list();

    void deleteById(Integer id);

    void add(Dept dept);

    Dept selectById(Integer id);

    void update(Dept dept);
}
