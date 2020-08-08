package com.huaying.hqwmall.product.dao;

import com.huaying.hqwmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author niehaibo
 * @email 838600724@qq.com
 * @date 2020-08-08 16:15:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
