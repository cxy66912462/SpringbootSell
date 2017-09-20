package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest(){
        ProductCategory one = productCategoryRepository.findOne(1);
        System.out.println("类别信息:"+one.toString());
    }

    @Test
    @Transactional
    public void InsertOneTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("ceshi");
        productCategory.setCategoryType(2);
        productCategory.setCategoryId(3);
        productCategoryRepository.save(productCategory);
    }
}