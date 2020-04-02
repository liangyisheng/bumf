package com.liangyisheng.bumf.service.impl;

import com.liangyisheng.bumf.dao.BumfArticleMapper;
import com.liangyisheng.bumf.model.BumfArticle;
import com.liangyisheng.bumf.service.BumfArticleService;
import com.liangyisheng.bumf.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/02.
 */
@Service
@Transactional
public class BumfArticleServiceImpl extends AbstractService<BumfArticle> implements BumfArticleService {
    @Resource
    private BumfArticleMapper bumfArticleMapper;

}
