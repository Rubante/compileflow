/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.compileflow.engine.process.preruntime.generator.impl.bpmn;

import com.alibaba.compileflow.engine.common.util.ExpressionUtil;
import com.alibaba.compileflow.engine.definition.bpmn.BaseParameter;
import com.alibaba.compileflow.engine.definition.bpmn.InputParameter;
import com.alibaba.compileflow.engine.definition.bpmn.ServiceTask;
import com.alibaba.compileflow.engine.process.preruntime.generator.code.CodeTargetSupport;
import com.alibaba.compileflow.engine.runtime.impl.AbstractProcessRuntime;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yusu
 */
public class ServiceTaskGenerator extends AbstractBpmnActionNodeGenerator<ServiceTask> {

    public ServiceTaskGenerator(AbstractProcessRuntime runtime,
                                ServiceTask flowNode) {
        super(runtime, flowNode);
    }

    @Override
    public void generateCode(CodeTargetSupport codeTargetSupport) {
        List<String> outputs = new ArrayList<>();
        // 按照bpmn2.0的输入 wangyijin
        if (flowNode.getParameters() != null) {
            for (BaseParameter parameter : flowNode.getParameters()) {
                String value = parameter.getValue();
                if (value != null && value.startsWith("$")) {
                    value = "_pContext.get(\"" + ExpressionUtil.trimNameKey(value) + "\")";
                } else {
                    value = "\"" + value + "\"";
                }
                String line = "_pContext.put(\"" + parameter.getName() + "\"," + value + ");";
                if (parameter instanceof InputParameter) {
                    codeTargetSupport.addBodyLine(line);
                } else {
                    outputs.add(line);
                }
            }
        }
        super.generateCode(codeTargetSupport);

        // 按照bpmn2.0的输出 wangyijin
        codeTargetSupport.addBodyLines(outputs);
    }

}
