package com.imooc.sell.dataobject;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chaoxingyu
 * Date: 2017-09-20
 * Time: 15:31
 */
public class BaseEntity {

    private Integer status;
    private Date changeTime;
    private Date createTime;
}
