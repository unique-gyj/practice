package com.shangguigu.springcloud.service;

import com.shangguigu.entities.Dept;

import java.util.List;

public interface DeptService {

    boolean add(Dept dept);
    Dept get(long id);
    List<Dept> list();
}
