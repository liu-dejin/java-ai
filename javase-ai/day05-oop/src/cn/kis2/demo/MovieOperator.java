package cn.kis2.demo;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovies() {
        System.out.println("========电影信息如下==============");
        for (int i = 0; i < movies.length; i++) {
            // 获取电影对象
            Movie m = movies[i];
            // 判断电影对象是否为空
            if (m != null) {
                System.out.println(m.getName() + "\t" + m.getId() + "\t" + m.getPrice() + "\t" + m.getActor());
            }
        }
    }

    public void searchMovie() {
        System.out.println("请输入要查询的电影id：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            // 获取电影对象
            Movie m = movies[i];
            // 判断电影对象是否为空并且id相等
            if (m != null && m.getId() == id) {
                System.out.println(m.getName() + "\t" + m.getId() + "\t" + m.getPrice() + "\t" + m.getActor());
                return;
            }
        }
        System.out.println("没有找到该id的电影,请输入正确的id");
        searchMovie();
    }
}
