package com.kingchalice.mywiki.service;

import com.kingchalice.mywiki.domain.Test;
import com.kingchalice.mywiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource //jdk自带
//    @Autowired  //spring带的
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }

}
