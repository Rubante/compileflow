package com.alibaba.compileflow.engine.common.util.bpmn;

import com.alibaba.compileflow.engine.common.constant.BpmnType;

/**
 * 各种工作流之间的xml转换
 *
 * @author wangyijin9 部门:运配产品研发组
 * @date 2022/2/23 10:50
 */
public class BpmnXmlTranslate {

    public static String translate(String xml, BpmnType bpmnType) {
        return xml;
    }

    public static String translateCamunda(String xml) {
        xml = xml.replaceAll("camunda:class", "cf:type=\"java\" cf:method=\"execute\" cf:class");
        xml = xml.replaceAll("xsi:type=\"bpmn2:tFormalExpression\"", "cf:type=\"java\"");
        xml = xml.replaceAll("xmlns:camunda=\"http://camunda.org/schema/1.0/bpmn\"", "xmlns:camunda=\"http://camunda.org/schema/1.0/bpmn\" xmlns:cf=\"http://compileflow.alibaba.com\"");
        xml = xml.replaceAll("<bpmndi:BPMNDiagram[\\S\\s]*</bpmndi:BPMNDiagram>", "");
        return xml;
    }
}
