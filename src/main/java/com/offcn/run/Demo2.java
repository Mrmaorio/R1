package com.offcn.run;

import com.offcn.pojo.TbItem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;

public class Demo2 {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext-solr.xml");
        SolrTemplate solrTemplate= (SolrTemplate) app.getBean("solrTemplate");
        // 添加数据到sorl
        TbItem item = new TbItem();
        item.setId(2L);
        item.setBrand("华为");
        item.setTitle("测试solr");
        item.setCategory("手机姬");
        // 保存数据到solr，一定要commit
        solrTemplate.saveBean(item);
        solrTemplate.commit();
        System.out.println("保存成功");
    }
   
}
