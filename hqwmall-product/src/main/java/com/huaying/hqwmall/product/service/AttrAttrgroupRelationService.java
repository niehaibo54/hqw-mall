package com.huaying.hqwmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huaying.common.utils.PageUtils;
import com.huaying.hqwmall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author niehaibo
 * @email 838600724@qq.com
 * @date 2020-08-08 16:15:44
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

