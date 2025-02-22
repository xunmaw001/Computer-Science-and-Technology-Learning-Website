package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.ZuoyeLiuyanDao;
import com.entity.ZuoyeLiuyanEntity;
import com.service.ZuoyeLiuyanService;
import com.entity.view.ZuoyeLiuyanView;

/**
 * 作业留言 服务实现类
 * @author 
 * @since 2021-04-21
 */
@Service("zuoyeLiuyanService")
@Transactional
public class ZuoyeLiuyanServiceImpl extends ServiceImpl<ZuoyeLiuyanDao, ZuoyeLiuyanEntity> implements ZuoyeLiuyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ZuoyeLiuyanView> page =new Query<ZuoyeLiuyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
