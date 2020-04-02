package com.liangyisheng.bumf.service.impl;

import com.liangyisheng.bumf.dao.BumfArticleTagMapper;
import com.liangyisheng.bumf.model.BumfArticleTag;
import com.liangyisheng.bumf.service.BumfArticleTagService;
import com.liangyisheng.bumf.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/02.
 */
@Service
@Transactional
public class BumfArticleTagServiceImpl extends AbstractService<BumfArticleTag> implements BumfArticleTagService {
    @Resource
    private BumfArticleTagMapper bumfArticleTagMapper;

}
