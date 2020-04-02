package com.liangyisheng.bumf.web;
import com.liangyisheng.bumf.core.Result;
import com.liangyisheng.bumf.core.ResultGenerator;
import com.liangyisheng.bumf.model.BumfArticle;
import com.liangyisheng.bumf.service.BumfArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/04/02.
*/
@RestController
@RequestMapping("/bumf/article")
public class BumfArticleController {
    @Resource
    private BumfArticleService bumfArticleService;

    @PostMapping("/add")
    public Result add(BumfArticle bumfArticle) {
        bumfArticleService.save(bumfArticle);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        bumfArticleService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(BumfArticle bumfArticle) {
        bumfArticleService.update(bumfArticle);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        BumfArticle bumfArticle = bumfArticleService.findById(id);
        return ResultGenerator.genSuccessResult(bumfArticle);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BumfArticle> list = bumfArticleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
