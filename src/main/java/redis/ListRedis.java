package redis;

import com.lambdaworks.redis.RedisConnection;

public class ListRedis {

    public static void listRedis(RedisConnection<String,String> connection){
        connection.lpush("rambaldiList","10");
        connection.lpush("rambaldiList","20");



        connection.lpush("rambaldiList","30");

        connection.rpush("rambaldiList","40");

        connection.lpush("rambaldiList","50");

        System.out.println(connection.lindex("rambaldiList",1));
        System.out.println(connection.lrange("rambaldiList",0 , -1));
        connection.del("rambaldiList");
    }
}
