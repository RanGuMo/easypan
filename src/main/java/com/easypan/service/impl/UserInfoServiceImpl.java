package com.easypan.service.impl;

import com.easypan.entity.UserInfo;
import com.easypan.mapper.UserInfoMapper;
import com.easypan.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author MoRanGu
 * @since 2023-08-18
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
