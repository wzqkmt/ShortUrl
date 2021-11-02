package com.example.validator;

import com.example.constant.CommonConstants;
import org.apache.commons.lang.StringUtils;
import org.assertj.core.util.Strings;
import org.springframework.stereotype.Component;

@Component
public class DomainNameValidator {

    public void validateGetShortUrl(String longUrl) {
        if (Strings.isNullOrEmpty(longUrl)) {
            throw new IllegalArgumentException("url is null or empty");
        }
        if (StringUtils.isEmpty(longUrl)){
            throw new IllegalArgumentException("url is empty");
        }
        if (longUrl.length() > CommonConstants.MAX_SUPPORT_URL_LENGTH) {
            throw new IllegalArgumentException("max support url length is: " + CommonConstants.MAX_SUPPORT_URL_LENGTH);
        }
    }

    public void validateGetLongUrl(String shortUrl) {
        if (Strings.isNullOrEmpty(shortUrl)) {
            throw new IllegalArgumentException("url is null or empty");
        }
        String[] splitString = shortUrl.split("/");
        if (splitString.length != 4) {
            throw new IllegalArgumentException("url is not illegal");
        }
        if (!shortUrl.contains(CommonConstants.BASE_URL)) {
            throw new IllegalArgumentException("url is not illegal");
        }
    }

}
