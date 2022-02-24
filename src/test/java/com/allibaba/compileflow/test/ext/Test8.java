package com.allibaba.compileflow.test.ext;

import java.util.Map;

/**
 * 请描述功能
 *
 * @author rubant
 * @date 2022/2/21 16:06
 */
public class Test8 {

    public Object execute(Map params) {
        System.out.println("test8");
        params.put("err1", true);
        params.put("err2", true);
        params.put("resultState1", 0);
        params.put("resultState2", 0);
        params.put("resultState3", 0);
        params.put("resultState4", 0);
        params.put("resultState5", 0);
        params.put("resultState6", 0);
        params.put("resultState7", 0);
        params.put("resultState8", 0);
        params.put("resultState9", 0);
        return params;
    }
}
