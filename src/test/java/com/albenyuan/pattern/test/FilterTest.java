package com.albenyuan.pattern.test;

import com.albenyuan.pattern.filter.AllowFilter;
import com.albenyuan.pattern.filter.Entity;
import com.albenyuan.pattern.filter.Filter;
import com.albenyuan.pattern.filter.RefuseFilter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Alben Yuan
 * @Date 2018-04-10 23:55
 */
public class FilterTest {

    private static final Logger logger = LoggerFactory.getLogger(FilterTest.class);

    @Test
    public void test() throws Exception {

        List<Entity> source = new ArrayList<Entity>() {
            {
                this.add(new Entity("不允许对象", false));
                this.add(new Entity("允许对象", true));
            }
        };
        Filter allowFilter = new AllowFilter();
        Filter refuseFilter = new RefuseFilter();

        List<Entity> allowList = allowFilter.filter(source);
        List<Entity> refuseList = refuseFilter.filter(source);
        logger.info("source:{}", source);
        logger.info("allow:{}", allowList);
        logger.info("refuse:{}", refuseList);
    }
}
