package redis;


import com.lambdaworks.redis.RedisConnection;

import static redis.ConnectRedis.shutdown;
import static redis.SetAndSortedSets.setAndSorted;

public class RedisJava {
    public static void main(String[] args) {

        RedisConnection<String,String> connection = ConnectRedis.getConnection();
//        connection.set("cong","dien van ", new SetArgs().ex(10));
//        HashtableRedis.hash(connection);
//        ListRedis.listRedis(connection);

//        connection.hmset("cong1",list);

        setAndSorted(connection);

        shutdown();
    }

}

