package cn.kis2.demo4test;

import java.util.*;

public class Room {
    // 1. 准备54张牌 给房间使用 集合容器装
    private List<Card> allCards = new ArrayList<>();

    // 2. 初始化54张牌
    {
        // 3.准备花色点数
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] sizes = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" ,"2"};

        // 4.组合花色和点数
        int number = 0;
        for (String size : sizes) {
            number++;
            for (String color : colors) {
                Card card = new Card(size, color,number);
                allCards.add(card);
            }
        }

        Collections.addAll(allCards, new Card("小王", "",++number), new Card("大王", "",++number));
        System.out.println("所有的牌" + allCards);
    }

    public void start() {
        // 洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后" + allCards);

        // 发牌 三个玩家 周润发 高进 小刀
        Map<String, List<Card>> players = new HashMap<>();
        List<Card> zrf = new ArrayList<>();
        players.put("周润发", zrf);

        List<Card> gj = new ArrayList<>();
        players.put("高进", gj);
        List<Card> xd = new ArrayList<>();
        players.put("小刀", xd);

        for (int i = 0; i < allCards.size() - 3; i++) {
            // 获取到当前的牌
            Card card = allCards.get(i);
            // 判断当前这张牌发给谁 轮询
            if (i % 3 == 0) {
                zrf.add(card);
            } else if (i % 3 == 1) {
                gj.add(card);
            } else {
                xd.add(card);
            }
        }



        // 底牌
        List<Card> cards = allCards.subList(allCards.size() - 3, allCards.size());
        System.out.println("底牌" + cards);

        // 抢地主
        zrf.addAll(cards);


        // 对牌排序
        // 打成stream流  处理完再存为list
        sortCards(zrf);
        sortCards(gj);
        sortCards(xd);

        // 看牌 遍历map
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    private void sortCards(List<Card> player) {
        player.sort(Comparator.comparingInt(Card::getNumber));

    }
}
