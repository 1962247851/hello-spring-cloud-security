package top.ordinaryroad.hello.spring.cloud.security.authorization.custom.config;

import org.springframework.security.oauth2.server.authorization.JdbcOAuth2AuthorizationService;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;

import java.util.LinkedHashSet;

/**
 * 修复序列化反序列化LinkedHashSet出现的问题
 */
public class CustomOAuth2AuthorizationRowMapper extends JdbcOAuth2AuthorizationService.OAuth2AuthorizationRowMapper {

    public CustomOAuth2AuthorizationRowMapper(RegisteredClientRepository registeredClientRepository) {
        super(registeredClientRepository);
        // Add LinkedHashSet to white list
        this.getObjectMapper().addMixIn(LinkedHashSet.class, LinkedHashSetMixin.class);
    }

}