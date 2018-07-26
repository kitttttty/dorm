package com.partner.dorm.impl;

import com.partner.dorm.entity.Roommate;
import com.partner.dorm.mapper.RoommateMapper;
import com.partner.dorm.service.IRoommateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理用户信息 服务实现类
 * </p>
 *
 * @author chengliang.luo
 * @since 2018-07-26
 */
@Service
public class IRoommateServiceImpl extends ServiceImpl<RoommateMapper, Roommate> implements IRoommateService {

}
