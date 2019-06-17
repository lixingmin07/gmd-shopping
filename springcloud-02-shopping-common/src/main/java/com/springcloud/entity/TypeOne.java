package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Type_One表对应的实体类，用于保存表中一行二级类别信息
 * @author 李兴敏
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeOne {
	/**
	 *����һ��� 
	 */
    private Integer typeOneId;

    /**
     * ����һ����
     */
    private String typeOneName;

    /**
     * ���
     */
    private Integer typeOneNum;

    /**
     * ��ע
     */
    private String typeOneRemark;

}