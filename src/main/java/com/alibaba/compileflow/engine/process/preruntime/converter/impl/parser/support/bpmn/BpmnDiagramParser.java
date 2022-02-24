package com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.support.bpmn;

import com.alibaba.compileflow.engine.definition.bpmn.BpmnDiagram;
import com.alibaba.compileflow.engine.definition.common.Element;
import com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.model.ParseContext;
import com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.model.XMLSource;
import com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.support.AbstractBpmnElementParser;

/**
 * 空实现的BpmnDiagram
 *
 * @author rubant
 * @date 2022/2/18 18:06
 */
public class BpmnDiagramParser extends AbstractBpmnElementParser<BpmnDiagram> {

    @Override
    protected BpmnDiagram doParse(XMLSource xmlSource, ParseContext parseContext) throws Exception {
        return null;
    }

    @Override
    protected void attachChildElement(Element childElement, BpmnDiagram element, ParseContext parseContext) {
    }

    @Override
    public String getName() {
        return "BPMNDiagram";
    }
}
