package BaiDuHot;

import java.util.Comparator;

public class News implements Comparable<News> {
    private String title;
    private int count;

    public News(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public News() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(News o) {
        //按照对象的count进行排序
        //主要判断条件: 按照年龄从小到大排序
        int result = o.count - this.count;
        //次要判断条件: 年龄相同时，按照title的字母顺序排序
        result = result == 0 ? this.title.compareTo(o.getTitle()) : result;
        return result;
    }


/*    @Override
    public int compare(News o1, News o2) {
        int result = o1.getCount() - o2.getCount();
        result = result == 0 ? o1.getTitle().compareTo(o2.getTitle()) : result;
        return result;
    }*/
}
