package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.NewBeeMallCheckGoodsService;
import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class CheckGoodsController {
	@Resource
	private NewBeeMallCheckGoodsService newBeeMallCheckGoodsService;
	
	@GetMapping("/checkgoods")
    @ResponseBody
    public Result getCheckGoods(int userId) {

        return ResultGenerator.genSuccessResult(NewBeeMallCheckGoodsService.getCheckGoodsesForIndex(userId,6));
    }
}