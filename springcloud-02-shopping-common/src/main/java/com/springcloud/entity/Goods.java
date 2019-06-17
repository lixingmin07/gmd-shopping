package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GOODS���Ӧ��ʵ���࣬���ڱ�����Ʒ��Ϣ
 * @author ������
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
	
	/**
	 * ��Ʒ���
	 */
    private Integer goodsId;

    /**
	 * ��Ʒ����
	 */
    private String goodsName;

    /**
	 * ��Ʒ�۸�
	 */
    private Double goodsPrice;

    /**
	 * ��Ʒ�ۿۼ�
	 */
    private Double goodsDiscount;

    /**
	 * ��Ʒ״̬
	 */
    private Integer goodsStatus;

    /**
	 * ��Ʒ����
	 */
    private Integer goodsNum;

    /**
	 * �Ƿ���Ʒ
	 */
    private Integer goodsNew;

    /**
	 * �Ƿ�����
	 */
    private Integer goodsHot;

    /**
	 * ��Ʒ����0-4,5������
	 */
    private Integer goodsLevel;

    /**
	 * ��Ʒ���
	 */
    private String goodsDesc;

    /**
	 * ��Ʒ����
	 */
    private String goodsDetail;

    /**
	 * ��ƷͼƬ
	 */
    private String goodsImg;

    /**
	 * ��������ű��
	 */
    private Integer typeTwoId;
    
    /**
     * ��Ʒ�۸�����
     */
    private Double goodsPriceMin;
    
    /**
     * ��Ʒ�۸�����
     */
    private Double goodsPriceMax;
    
    /**
	 * һ������ű��
	 */
    private Integer typeOneId;
    
    /**
     * 
     */
    private Integer goodsSum;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Double getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(Double goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getGoodsNew() {
        return goodsNew;
    }

    public void setGoodsNew(Integer goodsNew) {
        this.goodsNew = goodsNew;
    }

    public Integer getGoodsHot() {
        return goodsHot;
    }

    public void setGoodsHot(Integer goodsHot) {
        this.goodsHot = goodsHot;
    }

    public Integer getGoodsLevel() {
        return goodsLevel;
    }

    public void setGoodsLevel(Integer goodsLevel) {
        this.goodsLevel = goodsLevel;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Integer getTypeTwoId() {
        return typeTwoId;
    }

    public void setTypeTwoId(Integer typeTwoId) {
        this.typeTwoId = typeTwoId;
    }
}