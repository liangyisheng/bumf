package com.liangyisheng.bumf.web;
import com.liangyisheng.bumf.core.Result;
import com.liangyisheng.bumf.core.ResultGenerator;
import com.liangyisheng.bumf.model.BumfArticleTag;
import com.liangyisheng.bumf.service.BumfArticleTagService;
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
@RequestMapping("/bumf/article/tag")
public class BumfArticleTagController {
    @Resource
    private BumfArticleTagService bumfArticleTagService;

    @PostMapping("/add")
    public Result add(BumfArticleTag bumfArticleTag) {
        bumfArticleTagService.save(bumfArticleTag);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        bumfArticleTagService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(BumfArticleTag bumfArticleTag) {
        bumfArticleTagService.update(bumfArticleTag);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        BumfArticleTag bumfArticleTag = bumfArticleTagService.findById(id);
        return ResultGenerator.genSuccessResult(bumfArticleTag);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BumfArticleTag> list = bumfArticleTagService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
