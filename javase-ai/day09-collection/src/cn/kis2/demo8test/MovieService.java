package cn.kis2.demo8test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    // 集合容器 存储电影
    private static List<Movie> movies = new ArrayList<>();
   private static final Scanner sc = new Scanner(System.in);
    public void start() {
        // 准备操作界面
        while (true) {
            System.out.println("===电影信息系统===");
            System.out.println("1.上架");
            System.out.println("2.下架某个电影");
            System.out.println("3.查询某个电影");
            System.out.println("4.封杀");
            System.out.println("5.退出");
            System.out.println("6.查询电影全部");
            String command = sc.next();
            switch (command) {
                case "1":
                    // 上架 独立功能独立成方法
                    addMovie();
                    break;
                case "2":
                    // 下架
                    deleteMovie();
                    break;
                case "3":
                    // 查询电影
                    queryMovie();
                    break;
                case "4":
                    // 封杀明显
                    banStar();
                    break;
                case "5":
                    System.out.println("退出系统");
                    return;
                    case "6":
                    showAllMovie();
                    break;
                default:
                    System.out.println("输入的命令有误");
            }
        }
    }

    private void deleteMovie() {
        System.out.println("=======下架电影==========");
        System.out.println("请输入要下架的电影");
        String name = sc.next();
        Movie movie = queryMovieByName(name);
        if (movie != null) {
            movies.remove(movie);
            System.out.println("下架成功");
        } else {
            System.out.println("没有找到该电影");
        }
    }

    private void banStar() {
        System.out.println("==============封杀明星====================");
        System.out.println("请输入要封杀的明显");
        String star = sc.next();
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if (movie.getActor().contains(star)) {
                movies.remove(i);
                System.out.println("封杀成功");
                i--;
            }
        }
        showAllMovie();
    }

    // 展示全部电影
    private void showAllMovie() {
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " " + movie.getScore() + " " + movie.getActor() + " " + movie.getPrice());
        }
    }

    /**
     * 查询电影
     */
    private void queryMovie() {
        System.out.println("==========查询电影==========");
        System.out.println("请输入电影名称");
        String name = sc.next();
        Movie movie = queryMovieByName(name);
        if (movie != null) {
            System.out.println(movie.getName() + " " + movie.getScore() + " " + movie.getActor() + " " + movie.getPrice());
        } else {
            System.out.println("没有找到该电影");
        }

    }
    // 根据名称查询电影对象返回
    public Movie queryMovieByName(String name) {
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        return null;
    }

    /**
     * 上架电影
     */
    private void addMovie() {
        // 每点击一次上架电影 就新增一部信息，每部电影是一个电影对象
        // 1.创建电影对象 封装电影信息
        Movie movie = new Movie();
        // 2.给电影对象注入数据
        System.out.println("请输入电影名称");
        movie.setName(sc.next());
        System.out.println("请输入电影价格");
        movie.setScore(sc.nextDouble());
        System.out.println("请输入电影主演");
        movie.setActor(sc.next());
        System.out.println("请输入电影价格");
        movie.setPrice(sc.nextDouble());
        // 3.添加到集合里面
        movies.add(movie);
        System.out.println("上架成功");
    }
}
