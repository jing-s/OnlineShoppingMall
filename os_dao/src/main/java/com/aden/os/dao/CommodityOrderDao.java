package com.aden.os.dao;

import com.aden.os.entity.CommodityOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommodityOrderDao {

    void insert(CommodityOrder commodityOrder);

    void update(CommodityOrder commodityOrder);

    void delete(Integer id);

    CommodityOrder select(Integer id);

    List<CommodityOrder> selectByUserId(Integer userId);

    List<CommodityOrder> selectAll();
}
