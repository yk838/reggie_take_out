package com.yk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yk.mapper.EmployeeMapper;
import com.yk.pojo.Employee;
import com.yk.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
