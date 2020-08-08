package com.huaying.hqwmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huaying.common.utils.PageUtils;
import com.huaying.hqwmall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author niehaibo
 * @email 838600724@qq.com
 * @date 2020-08-08 16:15:44
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

