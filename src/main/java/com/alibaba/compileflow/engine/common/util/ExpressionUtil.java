package com.alibaba.compileflow.engine.common.util;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 条件表达式
 *
 * @author rubant
 * @date 2022/2/22 14:59
 */
public class ExpressionUtil {

    public static boolean evalCondition(Map root, String condition) {
        try {
            String regex = "[a-zA-Z\\$_][a-zA-Z\\$_\\d]+";

            // 去掉外层
            condition = trimNameKey(condition.trim());

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(condition);
            while (matcher.find()) {
                if (!isKeyword(matcher.group())) {
                    condition = condition.replace(matcher.group(), "_pContext.get(\"" + matcher.group() + "\")");
                }
            }

            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            engine.put("_pContext", root);
            Object result = engine.eval(condition);
            return (boolean) result;
        } catch (ScriptException scriptException) {
            scriptException.printStackTrace();
            return false;
        }
    }

    /**
     * 转换为表达式的key值
     *
     * @param key
     * @return
     */
    public static String trimNameKey(String key) {
        return key.replace("${", "").replace("}", "");
    }

    /**
     * 是否为关键字
     *
     * @param key
     * @return
     */
    public static boolean isKeyword(String key) {
        if (Boolean.TRUE.toString().equalsIgnoreCase(key.trim())) {
            return true;
        }
        if (Boolean.FALSE.toString().equalsIgnoreCase(key.trim())) {
            return true;
        }

        return false;
    }
}
