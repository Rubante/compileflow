//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package compileflow;

import com.alibaba.compileflow.engine.common.util.ExpressionUtil;
import com.alibaba.compileflow.engine.common.util.ObjectFactory;
import com.alibaba.compileflow.engine.runtime.instance.ProcessInstance;
import com.allibaba.compileflow.test.ext.Test1;
import com.allibaba.compileflow.test.ext.Test2;
import com.allibaba.compileflow.test.ext.Test3;
import com.allibaba.compileflow.test.ext.Test4;
import com.allibaba.compileflow.test.ext.Test5;
import com.allibaba.compileflow.test.ext.Test6;
import com.allibaba.compileflow.test.ext.Test7;
import com.allibaba.compileflow.test.ext.Test8;
import java.util.HashMap;
import java.util.Map;

public class AbcddFlow implements ProcessInstance {
    public AbcddFlow() {
    }

    public Map<String, Object> execute(Map<String, Object> _pContext) throws Exception {
        Map<String, Object> _pResult = new HashMap();
        ((Test8)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test8")).execute(_pContext);
        this.exclusiveGatewayGateway_1mw03k9(_pContext);
        _pResult.putAll(_pContext);
        return _pResult;
    }

    private void exclusiveGatewayGateway_1mw03k9(Map _pContext) throws Exception {
        if (ExpressionUtil.evalCondition(_pContext, "err1 == true")) {
            ((Test1)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test1")).execute(_pContext);
            this.exclusiveGatewayGateway_19k13t0(_pContext);
        } else if (ExpressionUtil.evalCondition(_pContext, "err2 == false")) {
            ((Test2)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test2")).execute(_pContext);
            this.exclusiveGatewayGateway_0h6t8m8(_pContext);
        }

    }

    private void exclusiveGatewayGateway_19k13t0(Map _pContext) throws Exception {
        if (ExpressionUtil.evalCondition(_pContext, "resultState1 == 0")) {
            ((Test2)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test2")).execute(_pContext);
            this.exclusiveGatewayGateway_0h6t8m8(_pContext);
        } else if (ExpressionUtil.evalCondition(_pContext, "resultState4 != 0")) {
            ((Test7)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test7")).execute(_pContext);
        }

    }

    private void exclusiveGatewayGateway_0h6t8m8(Map _pContext) throws Exception {
        if (ExpressionUtil.evalCondition(_pContext, "resultState2 == 0")) {
            ((Test3)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test3")).execute(_pContext);
            this.exclusiveGatewayGateway_0q04tqb(_pContext);
        } else if (ExpressionUtil.evalCondition(_pContext, "resultState6 != 0")) {
            ((Test7)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test7")).execute(_pContext);
        }

    }

    private void exclusiveGatewayGateway_0q04tqb(Map _pContext) throws Exception {
        if (ExpressionUtil.evalCondition(_pContext, "resultState3 == 0")) {
            ((Test4)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test4")).execute(_pContext);
            this.exclusiveGatewayGateway_1e5ne08(_pContext);
        } else if (ExpressionUtil.evalCondition(_pContext, "resultState5 != 0")) {
            ((Test7)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test7")).execute(_pContext);
        }

    }

    private void exclusiveGatewayGateway_1e5ne08(Map _pContext) throws Exception {
        if (ExpressionUtil.evalCondition(_pContext, "resultState7 == 0")) {
            ((Test5)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test5")).execute(_pContext);
            this.exclusiveGatewayGateway_0s1kboo(_pContext);
        } else if (ExpressionUtil.evalCondition(_pContext, "resultState10 == 0")) {
            ((Test7)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test7")).execute(_pContext);
        }

    }

    private void exclusiveGatewayGateway_0s1kboo(Map _pContext) throws Exception {
        if (ExpressionUtil.evalCondition(_pContext, "resultState8 == 0")) {
            ((Test6)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test6")).execute(_pContext);
            ((Test7)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test7")).execute(_pContext);
        } else if (ExpressionUtil.evalCondition(_pContext, "resultState9 == 0")) {
            ((Test7)ObjectFactory.getInstance("com.allibaba.compileflow.test.ext.Test7")).execute(_pContext);
        }

    }
}
