package com.shangguigu.springcloud.service.imp;

import com.shangguigu.entities.Dept;
import com.shangguigu.service.DeptClientService;
import com.shangguigu.springcloud.dao.DeptDao;
import com.shangguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImp implements DeptService {

    @Autowired
    private DeptDao deptDao;


    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
