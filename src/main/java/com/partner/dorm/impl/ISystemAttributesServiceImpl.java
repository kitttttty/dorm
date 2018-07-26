package com.partner.dorm.impl;

import com.partner.dorm.entity.SystemAttributes;
import com.partner.dorm.mapper.SystemAttributesMapper;
import com.partner.dorm.service.ISystemAttributesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 基础数据表 服务实现类
 * </p>
 *
 * @author chengliang.luo
 * @since 2018-07-26
 */
@Service
public class ISystemAttributesServiceImpl extends ServiceImpl<SystemAttributesMapper, SystemAttributes> implements ISystemAttributesService {

}
