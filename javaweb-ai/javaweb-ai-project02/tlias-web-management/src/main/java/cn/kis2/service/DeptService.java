package cn.kis2.service;


import cn.kis2.pojo.Dept;

import java.util.List;

public interface DeptService {
    /*
    查询所有部门
     */
    List<Dept> findAll();

    void delete(Integer id);

    void add(Dept dept);

    Dept findById(Integer id);

    void update(Dept dept);
}
