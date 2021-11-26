package com.example.validator;

import com.example.constant.CommonConstants;
import org.apache.commons.lang.StringUtils;
import org.assertj.core.util.Strings;
import org.springframework.stereotype.Component;

@Component
public class DomainNameValidator {

    public void validateGetShortUrl(String longUrl) {
        if (Strings.isNullOrEmpty(longUrl)) {
            throw new IllegalArgumentException("url不能为null或者为空");
        }
        if (StringUtils.isEmpty(longUrl)){
            throw new IllegalArgumentException("url为空");
        }
        if (longUrl.length() > CommonConstants.MAX_SUPPORT_URL_LENGTH) {
            throw new IllegalArgumentException("url最大长度为: " + CommonConstants.MAX_SUPPORT_URL_LENGTH);
        }
    }

    public void validateGetLongUrl(String shortUrl) {
        if (Strings.isNullOrEmpty(shortUrl)) {
            throw new IllegalArgumentException("url为null或者为空");
        }
        String[] splitString = shortUrl.split("/");
        if (splitString.length != 4) {
            throw new IllegalArgumentException("短域名url不符合规定，请输入符合规定的url");
        }
        if (!shortUrl.contains(CommonConstants.BASE_URL)) {
            throw new IllegalArgumentException("url域名不符合规定");
        }
    }

}
