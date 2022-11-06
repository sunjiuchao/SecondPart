package ZuoYe.Demo01;

import java.util.*;

public class GrilTest {
    public static void main(String[] args) {
        HashSet<GirlFriend> girlFriends = new HashSet<>();
        GirlFriend gf1 = new GirlFriend("阿三面馆",101);
        GirlFriend gf2 = new GirlFriend("阿四粥馆",102);
        GirlFriend gf3 = new GirlFriend("阿五米馆",103);
        GirlFriend gf4 = new GirlFriend("阿六快递",104);
        girlFriends.add(gf1);
        girlFriends.add(gf2);
        girlFriends.add(gf3);
        girlFriends.add(gf4);
        System.out.println(girlFriends);



    }
}
