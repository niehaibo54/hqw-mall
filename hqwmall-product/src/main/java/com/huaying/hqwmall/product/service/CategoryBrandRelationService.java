package com.huaying.hqwmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huaying.common.utils.PageUtils;
import com.huaying.hqwmall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author niehaibo
 * @email 838600724@qq.com
 * @date 2020-08-08 16:15:44
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

