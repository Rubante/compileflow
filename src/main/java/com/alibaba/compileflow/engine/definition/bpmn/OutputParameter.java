package com.alibaba.compileflow.engine.definition.bpmn;

/**
 * 输出参数
 *
 * @author rubant
 * @date 2022/2/22 19:40
 */
public class OutputParameter implements BaseParameter {

    private String name;

    private String value;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
