package com.springcloud.dao;

import com.springcloud.entity.Goods;
import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    List<Goods> selectAll();

    int updateByPrimaryKey(Goods record);
    
    /**
               * 鏌ヨGoods琛ㄤ腑婊¤冻鏉′欢鐨勫晢鍝佷俊鎭�
     * 
     * @param goods	鏌ヨ鏉′欢
     * @return	鎴愬姛杩斿洖java.util.List绫诲瀷鐨勫疄渚嬶紝鍚﹀垯杩斿洖null
     */
    public abstract List<Goods> select(Goods goods);
    
    /**
     * 鏍规嵁鏉′欢淇敼Goods琛ㄤ腑鎸囧畾Goods_Id鐨勫晢鍝佷俊鎭�
     * @param goods	淇敼鐨勫晢鍝佷俊鎭�
     * @return	鎴愬姛杩斿洖澶т簬0鐨勬暣鏁帮紝鍚﹀垯杩斿洖灏忎簬绛変簬0鐨勬暣鏁�
     */
    public abstract Integer updateGoodsById(Goods goods);
    
    /**
     * 查询销量前10的商品信息
     * 
     * @return 成功返回java.util.List类型的实例，否则返回null
     */
    public abstract List<Goods> selectGroup();
}