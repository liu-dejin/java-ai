package cn.kis2.service;

import cn.kis2.pojo.Clazz;
import cn.kis2.pojo.ClazzQueryParam;
import cn.kis2.pojo.PageResult;

import java.util.List;

public interface ClazzService {

    PageResult<Clazz> page(ClazzQueryParam clazzQueryParam);

    void add(Clazz clazz);

    Clazz getById(Integer id);

    void update(Clazz clazz);

    void delete(Integer id);

    List<Clazz> list();
}
