package redis;

import com.lambdaworks.redis.RedisConnection;

public class HashtableRedis {
    public static void hash(RedisConnection<String,String> connection){

        connection.hset("congdv","dienvan","10");
        connection.hset("congdv", "dv","100");



        connection.hset("congdv","cong","50");


        connection.hincrby("congdv","cong",10);

        System.out.println(connection.hgetall("congdv"));
    }
}
