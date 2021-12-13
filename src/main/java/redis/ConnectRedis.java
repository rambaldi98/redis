package redis;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.RedisConnection;
import com.lambdaworks.redis.RedisURI;

import java.util.concurrent.TimeUnit;

public class ConnectRedis {
    private static RedisConnection<String,String> connection;
    private static RedisClient redisClient;

    public static RedisConnection getConnection(){
        if(connection == null){
            try {
                 redisClient = new RedisClient(
                        RedisURI.create("redis://ckxgICBvYnGI4fXPlwQucXtjAXXjQNou@redis-16471.c273.us-east-1-2.ec2.cloud.redislabs.com:16471"));
                connection = redisClient.connect();
            } catch (Exception e){
                System.out.println(e);
            }
        }
        return connection;
    }

    public static void shutdown() {
        connection.close();
        redisClient.shutdown();
    }

}
