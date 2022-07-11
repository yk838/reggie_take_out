package com.yk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yk.mapper.SetmealMapper;
import com.yk.pojo.Setmeal;
import com.yk.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
}
