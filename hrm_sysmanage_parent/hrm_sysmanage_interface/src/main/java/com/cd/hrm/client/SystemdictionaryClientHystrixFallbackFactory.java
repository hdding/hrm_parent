package com.cd.hrm.client;

import com.cd.hrm.domain.Systemdictionary;
import com.cd.hrm.query.SystemdictionaryQuery;
import com.cd.hrm.util.AjaxResult;
import com.cd.hrm.util.PageList;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yaohuaipeng
 * @date 2018/10/8-16:18
 */
@Component
public class SystemdictionaryClientHystrixFallbackFactory implements FallbackFactory<SystemdictionaryClient> {

    @Override
    public SystemdictionaryClient create(Throwable throwable) {
        return new SystemdictionaryClient() {
            @Override
            public AjaxResult save(Systemdictionary systemdictionary) {
                return null;
            }

            @Override
            public AjaxResult delete(Integer id) {
                return null;
            }

            @Override
            public Systemdictionary get(Long id) {
                return null;
            }

            @Override
            public List<Systemdictionary> list() {
                return null;
            }

            @Override
            public PageList<Systemdictionary> json(SystemdictionaryQuery query) {
                return null;
            }
        };
    }
}
