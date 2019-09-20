package com.offcn.run;

import com.offcn.pojo.TbItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-solr.xml")
public class Demo3 {

    @Autowired
    private SolrTemplate solrTemplate;

    /**
     * 删除
     */
    @Test
    public void testDel(){
        solrTemplate.deleteById("1");
        System.out.println("删除成功");
        Query query=new SimpleQuery("*:*");

    }
}
