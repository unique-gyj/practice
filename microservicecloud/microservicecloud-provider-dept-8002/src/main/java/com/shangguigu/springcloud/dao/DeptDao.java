package com.shangguigu.springcloud.dao;

import com.shangguigu.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {
    boolean addDept(Dept dept);
    Dept findById(long id);
    List<Dept> findAll();
}
