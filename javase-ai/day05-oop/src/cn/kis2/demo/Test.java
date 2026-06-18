package cn.kis2.demo;

public class Test {
    static void main() {
        // 面向对象小案例
        // 1. 创建电影对象.封装电影数据
        // 2.封装系统中的全部电影数据 （造数据）
        Movie[] movies = new Movie[10];
        // movies  = [null,null,null,null,null,null,null,null,null,null]
        movies[0] = new Movie(1, "唐顿庄园", 9.5, "Tim Allen");
        movies[1] = new Movie(2, "霸王别姬", 9.2, "Morgan Freeman");
        movies[5] = new Movie(6, "乱世佳人", 8.8, "Margaret Mitchell");
        movies[6] = new Movie(7, "楚门的世界", 8.7, "J. J. Abrams");
        movies[7] = new Movie(8, "盗梦空间", 8.6, "Christopher Nolan");
        movies[8] = new Movie(9, "霸王别姬", 8.5, "Morgan Freeman");
        movies[9] = new Movie(10, "这个杀手不太冷", 8.4, "Pak Chan-wook");

        // 3.创建操作对象 处理业务
        MovieOperator mo = new MovieOperator(movies);
        mo.printAllMovies();
        mo.searchMovie();
    }
}
