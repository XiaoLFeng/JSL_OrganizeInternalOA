package com.jsl.oa.model.doData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBeanDO {
    private Long total;//总记录数
    private List rows;//数据列表
}
