package com.partner.dorm.impl;

import com.partner.dorm.entity.EmailTemplate;
import com.partner.dorm.mapper.EmailTemplateMapper;
import com.partner.dorm.service.IEmailTemplateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邮件模板表 服务实现类
 * </p>
 *
 * @author chengliang.luo
 * @since 2018-07-26
 */
@Service
public class IEmailTemplateServiceImpl extends ServiceImpl<EmailTemplateMapper, EmailTemplate> implements IEmailTemplateService {

}
