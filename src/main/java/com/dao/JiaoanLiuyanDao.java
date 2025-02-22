package com.dao;

import com.entity.JiaoanLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoanLiuyanView;

/**
 * 教案留言 Dao 接口
 *
 * @author 
 * @since 2021-04-21
 */
public interface JiaoanLiuyanDao extends BaseMapper<JiaoanLiuyanEntity> {

   List<JiaoanLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
