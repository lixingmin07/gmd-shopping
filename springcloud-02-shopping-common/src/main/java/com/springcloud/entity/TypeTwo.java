package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Type_two表对应的实体类，用于保存表中一行二级类别信息
 * @author 李兴敏
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeTwo {
	/**
	 * ���Ͷ����
	 */
    private Integer typeTwoId;

    /**
     * ���Ͷ�����
     */
    private String typeTwoName;

    /**
     * ����һ���
     */
    private Integer typeOneId;

    /**
     * ��ע
     */
    private String typeTwoRemark;

}