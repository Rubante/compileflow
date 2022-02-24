package com.alibaba.compileflow.engine.common.util.bpmn;

/**
 * xml数据校验
 *
 * @author wangyijin9 部门:运配产品研发组
 * @date 2022/2/24 10:49
 */
public class BpmnXmlValidate {

    /**
     * 不支持以下的标签
     *
     * @param xml
     * @return
     */
    public boolean validate(String xml) {
        if (xml.matches("bpmn2:task")) {
            return false;
        }
        if (xml.matches("bpmn2:sendTask")) {
            return false;
        }
        if (xml.matches("bpmn2:userTask")) {
            return false;
        }
        if (xml.matches("bpmn2:manualTask")) {
            return false;
        }
        if (xml.matches("bpmn2:businessRuleTask")) {
            return false;
        }
        if (xml.matches("bpmn2:parallelGateway")) {
            return false;
        }
        if (xml.matches("bpmn2:inclusiveGateway")) {
            return false;
        }
        if (xml.matches("bpmn2:complexGateway")) {
            return false;
        }
        if (xml.matches("bpmn2:eventBasedGateway")) {
            return false;
        }
        if (xml.matches("bpmn2:category")) {
            return false;
        }
        if (xml.matches("bpmn2:category")) {
            return false;
        }
        if (xml.matches("bpmn2:collaboration")) {
            return false;
        }

        return true;
    }
}
