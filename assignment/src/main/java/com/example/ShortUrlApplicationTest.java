package com.example;

import com.example.validator.DomainNameValidatorTest;
import com.example.service.DomainNameServiceImplTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DomainNameValidatorTest.class,
        DomainNameServiceImplTest.class
})
public class ShortUrlApplicationTest {
//这个测试类就是为了同时跑DomainNameValidatorTest和DomainNameServiceImplTest这两个类

}
