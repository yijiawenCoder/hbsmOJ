package com.yijiawenCoder.hbsmoj.model.enums;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 题目提交枚举
 @author <a href="https://github.com/yijiawenCoder">yijiawenCoder</a>
 */
public enum QuestionSubmitEnum {

    WAITING("待判题", 0),
    RUNNING("判题中", 1),
    SUCCEED("成功", 2),
    FAILED("失败", 3);

    private final String text;

    private final Integer value;

    QuestionSubmitEnum(String text, Integer value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<Integer> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value
     * @return
     */
    public static QuestionSubmitEnum getEnumByValue(Integer value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (QuestionSubmitEnum anEnum : QuestionSubmitEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }

    public Integer getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
