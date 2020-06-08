package com.puhui.xiaojin.config;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
 
import com.alibaba.fastjson.JSONObject;
 
/**
 * 
 * @author ouyangjun
 */
public class ObjectToJsonUtils {
 
    /**
     * List<Map<Object,Object>>转换List<T>
     */
    @SuppressWarnings("unchecked")
    public static <T> List<T> castMapToBean(List<Map<String, Object>> list, Class<?> beanClass) {
        List<T> returnList = new ArrayList<T>();
        if (list == null || list.size()==0) {
            return null;
        }
        
        String json = "";
        for (Map<String, Object> map : list) {
            json = JSONObject.toJSONString(map);
        	
            // 添加到集合中
            returnList.add((T)JSONObject.parseObject(json, beanClass));
        }
        // 返回
        return returnList;
    }
}