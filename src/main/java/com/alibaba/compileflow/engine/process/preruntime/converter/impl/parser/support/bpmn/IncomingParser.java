package com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.support.bpmn;

import com.alibaba.compileflow.engine.definition.bpmn.Incoming;
import com.alibaba.compileflow.engine.definition.common.Element;
import com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.model.ParseContext;
import com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.model.XMLSource;
import com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.support.AbstractBpmnElementParser;

/**
 * 请描述功能
 *
 * @author rubant
 * @date 2022/2/18 18:06
 */
public class IncomingParser extends AbstractBpmnElementParser<Incoming> {

    @Override
    protected Incoming doParse(XMLSource xmlSource, ParseContext parseContext) throws Exception {
        Incoming incoming = new Incoming();
        return incoming;
    }

    @Override
    protected void attachChildElement(Element childElement, Incoming element, ParseContext parseContext) {
    }

    @Override
    public String getName() {
        return "incoming";
    }
}
