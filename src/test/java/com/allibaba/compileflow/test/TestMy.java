package com.allibaba.compileflow.test;

import com.alibaba.compileflow.engine.ProcessEngine;
import com.alibaba.compileflow.engine.ProcessEngineFactory;
import com.alibaba.compileflow.engine.common.constant.FlowModelType;
import com.alibaba.compileflow.engine.common.util.bpmn.BpmnXmlTranslate;
import com.alibaba.compileflow.engine.common.util.FileUtils;
import com.alibaba.compileflow.engine.definition.bpmn.BpmnModel;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 请描述功能
 *
 * @author rubant
 * @date 2022/2/21 9:38
 */
public class TestMy {

    public static void main(String[] args) throws Exception {
        final String code = "bpmn20.ktv.ktv2Example";

//        URL url = TestMy.class.getResource("/bpmn20/ktv/ktv2Example.bpmn20");
        URL url = TestMy.class.getResource("/bpmn20/ktv/diagram-camunda.bpmn");
        String str = new String(FileUtils.readFileToByteArray(new File(url.getFile())));
        str = BpmnXmlTranslate.translateCamunda(str);
        System.out.println(str);

        final Map<String, Object> context = new HashMap<>();
        final List<String> pList = new ArrayList<>();
        pList.add("wuxiang");
        pList.add("xuan");
        pList.add("yusu");
        context.put("pList", pList);
        context.put("resultState", 0);
//        context.put("totalPrice", 500);

        final ProcessEngine<BpmnModel> processEngine = ProcessEngineFactory.getProcessEngine(FlowModelType.BPMN);
//        final BpmnModel tbbpmModel = processEngine.loadXml(str);
//        final OutputStream outputStream = BpmnModelConverter.getInstance().convertToStream(tbbpmModel);
//         System.out.println(processEngine.getTestCode(code));

        processEngine.preCompileXml(code, str);

        System.out.println(processEngine.execute(code, context));
    }
}
