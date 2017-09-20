package com.imooc.sell;

import com.imooc.sell.VO.ResultVO;
import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chaoxingyu
 * Date: 2017-09-20
 * Time: 17:13
 */
@RestController
@RequestMapping("/buyer/product/")
public class BuyerProductController {


    @RequestMapping("list")
    public ResultVO list(){
        ResultVO resultVO = new ResultVO();
        return resultVO;
    }

}
