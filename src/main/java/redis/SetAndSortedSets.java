package redis;

import com.lambdaworks.redis.RedisConnection;

public class SetAndSortedSets {

    public static void setAndSorted(RedisConnection<String,String> connection){
//        connection.sadd("set","cong");
//        connection.sadd("set","congdv");
//        connection.sadd("set1","congdv");
//        connection.sadd("set1","congdv2");
//        System.out.println(connection.smembers("set1"));
//        System.out.println(connection.sunion("set","set1"));
//        // tra phan tu khac nhau
//        System.out.println(connection.sdiff("set","set1"));

        // sorted set

        connection.zadd("sorted1",100,"cong1");
        connection.zadd("sorted1",110,"cong2");
        connection.zadd("sorted1",90,"cong3");
        connection.zadd("sorted1",140,"cong4");


        System.out.println(connection.zrangeWithScores("sorted1",0,-1));

        System.out.println(connection.zrangebyscore("sorted1",100,150));

        System.out.println(connection.zrank("sorted1","cong2"));
        System.out.println(connection.zrem("sorted1","cong2"));

    }

}

