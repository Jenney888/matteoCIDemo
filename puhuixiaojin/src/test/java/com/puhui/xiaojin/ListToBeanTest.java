package com.puhui.xiaojin;
 
import com.puhui.xiaojin.config.ListMapToBeanUtils;
import com.puhui.xiaojin.config.ObjectToJsonUtils;
import com.puhui.xiaojin.dto.PhoneVO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
public class ListToBeanTest {
 
    public static void main(String[] args) throws Exception {
        // 初始化
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("plate", "hw");
        map.put("number", 13655555555L);
        map.put("memory", 4.0);
        map.put("size", 6.0);
		
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("plate", "vivo");
        map1.put("number", 13677777777L);
        map1.put("memory", 5.5);
        map1.put("size", 3.8);
		
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(map);
        list.add(map1);
        List<PhoneVO> phoneList  = ObjectToJsonUtils.castMapToBean(list,PhoneVO.class);

        // List<Map<String, Object>>转List<T>
//        List<PhoneVO> phoneList = ListMapToBeanUtils.castMapToBean(list, PhoneVO.class);
        System.out.println("==>phoneList.size(): " + phoneList.size());
        for (PhoneVO phone : phoneList) {
            System.out.println(phone.getPlate() + "\t" + phone.getNumber()
                + "\t" + phone.getMemory() + "\t" + phone.getSize());
        }
    }
}