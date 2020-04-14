package com.example.SpringBoot.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisSocketConfiguration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;


@Configuration
public class RedisConfiguration {
//    @Bean
//    public RedisConnectionFactory redisConnectionFactory() {
//        LettuceConnectionFactory connectionFactory = new LettuceConnectionFactory();
//        return connectionFactory;
//    }
//
//
//    @Bean
//    public RedisTemplate<redisdata, String> redisTemplate() {
//        RedisTemplate<redisdata, String> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(redisConnectionFactory());
//        return redisTemplate;
//    }

//    @Bean
//    public LettuceConnectionFactory redisConnectionFactory() {
//
//        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("server", 6379));
//    }
//    @Bean
//    public LettuceConnectionFactory redisConnectionFactory() {
//
//        return new LettuceConnectionFactory(new RedisSocketConfiguration("/var/run/redis.sock"));
//
//    }




@Bean
JedisConnectionFactory jedisConnectionFactory() {
    return new JedisConnectionFactory();
}


//
@Bean
public RedisTemplate<String, Object> redisTemplate() {
    final RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
    template.setConnectionFactory(jedisConnectionFactory());
    template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
    return template;
}


}


