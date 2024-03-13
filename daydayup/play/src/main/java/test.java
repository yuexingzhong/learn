import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2024/3/12 16:42
 * Version：1.0.0
 */
public class test {

    public static void main(String[] args) {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration("100.123.250.5", 6380);
        redisStandaloneConfiguration.setPassword("7XR4lXJPMV");
        LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory(redisStandaloneConfiguration);
        lettuceConnectionFactory.afterPropertiesSet();


        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(lettuceConnectionFactory);
        redisTemplate.setKeySerializer(jackson2JsonRedisSerializer);
        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.setHashKeySerializer(jackson2JsonRedisSerializer);
        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.afterPropertiesSet();
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(lettuceConnectionFactory);

        // 设置 redis 字符串数据
        BoundListOperations<String, Object> listOps = redisTemplate.boundListOps("mini");
        listOps.rightPush("123");
        
        while (true){
            System.out.println(redisTemplate.boundListOps("mini").rightPop());
        }
        
        
        
        
        
//        // 获取存储的数据并输出
//        System.out.println("Stored string in redis: " + redisTemplate.opsForValue().get("name"));
//
//        // 存储数据到列表中
//        redisTemplate.opsForList().leftPush("languages", "Java");
//        redisTemplate.opsForList().leftPush("languages", "Python");
//        redisTemplate.opsForList().leftPush("languages", "C++");
//        // 获取存储的数据并输出
//        System.out.println("Stored list in redis: " + redisTemplate.opsForList().range("languages", 0, -1));
//
//        // 存储数据到集合中
//        redisTemplate.opsForSet().add("cities", "New York");
//        redisTemplate.opsForSet().add("cities", "London");
//        redisTemplate.opsForSet().add("cities", "Tokyo");
//        // 获取存储的数据并输出
//        System.out.println("Stored set in redis: " + redisTemplate.opsForSet().members("cities"));
    }
}
