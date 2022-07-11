package com.yk.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yk.mapper.DishMapper;
import com.yk.pojo.Dish;
import com.yk.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}
