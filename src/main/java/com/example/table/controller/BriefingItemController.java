package com.example.table.controller;

import com.example.table.model.BriefingItem;
import com.example.table.repo.BriefingItemRepositiry;
import com.example.table.util.BaseResult;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @ClassName BriefingItemController
 * @Description
 * @Author jianquan.liang
 * @Date 9/3/2019 3:23 PM
 * @Version 1.0
 **/
@RestController
@Api(value = "BriefingItemController", description = "BriefingItem管理API")
@RequestMapping("/BriefingItem")
public class BriefingItemController {

    @Autowired
    private BriefingItemRepositiry briefingItemRepositiry;

    @ApiOperation(value = "获取BriefingItem列表", notes = "查询BriefingItem列表")
    @ApiResponses({
            @ApiResponse(code = 100, message = "异常数据")
    })
    @RequestMapping(value ="/getAllBriefingItems", method = RequestMethod.GET)
    public List<BriefingItem> getBriefingAllItems(){
        return briefingItemRepositiry.findAll();
    }

    @ApiOperation(value = "创建BriefingItem", notes = "根据BriefingItem对象创建BriefingItem")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "ID", dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "title", value = "标题", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "content", value = "内容", required = true, dataType ="String", paramType = "query"),
            @ApiImplicitParam(name = "sourceType", value = "资源类型", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "source", value = "资源", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "category", value = "分类", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "开始时间", required = false, dataType = "String", paramType = "query"),
    })
    @PostMapping()
    public BaseResult<BriefingItem> postBriefingItem(BriefingItem briefingItem){
        return BaseResult.successWithData(briefingItemRepositiry.save(briefingItem));
    }


}
