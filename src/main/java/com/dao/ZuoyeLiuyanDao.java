package com.dao;

import com.entity.ZuoyeLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyeLiuyanView;

/**
 * 作业留言 Dao 接口
 *
 * @author 
 * @since 2021-04-21
 */
public interface ZuoyeLiuyanDao extends BaseMapper<ZuoyeLiuyanEntity> {

   List<ZuoyeLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
