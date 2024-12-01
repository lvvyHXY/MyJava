package com.itheima.ui;

import java.io.Serial;
import java.io.Serializable;

public class Content implements Serializable {

    @Serial
    private static final long serialVersionUID = 5917479747209453928L;
    private String number;
    private String title;
    private String content;

    public Content() {
    }

    public Content(String number, String title, String content) {
        this.number = number;
        this.title = title;
        this.content = content;
    }

    /**
     * 获取
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "Content{number = " + number + ", title = " + title + ", content = " + content + "}";
    }
}
