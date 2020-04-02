package com.liangyisheng.bumf.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bumf_article")
public class BumfArticle {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 作者昵称
     */
    private String nickname;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章摘要
     */
    private String summary;

    /**
     * 浏览数
     */
    @Column(name = "view_num")
    private Integer viewNum;

    /**
     * 评论数
     */
    @Column(name = "comment_num")
    private Integer commentNum;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 文章标签
     */
    private String tags;

    /**
     * 文章分类ID
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 文章内容txt
     */
    private String content;

    /**
     * 文章内容html
     */
    @Column(name = "content_html")
    private String contentHtml;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取作者昵称
     *
     * @return nickname - 作者昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置作者昵称
     *
     * @param nickname 作者昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取文章标题
     *
     * @return title - 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置文章标题
     *
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取文章摘要
     *
     * @return summary - 文章摘要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置文章摘要
     *
     * @param summary 文章摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取浏览数
     *
     * @return view_num - 浏览数
     */
    public Integer getViewNum() {
        return viewNum;
    }

    /**
     * 设置浏览数
     *
     * @param viewNum 浏览数
     */
    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }

    /**
     * 获取评论数
     *
     * @return comment_num - 评论数
     */
    public Integer getCommentNum() {
        return commentNum;
    }

    /**
     * 设置评论数
     *
     * @param commentNum 评论数
     */
    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    /**
     * 获取权重
     *
     * @return weight - 权重
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置权重
     *
     * @param weight 权重
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取文章标签
     *
     * @return tags - 文章标签
     */
    public String getTags() {
        return tags;
    }

    /**
     * 设置文章标签
     *
     * @param tags 文章标签
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * 获取文章分类ID
     *
     * @return category_id - 文章分类ID
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置文章分类ID
     *
     * @param categoryId 文章分类ID
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取文章内容txt
     *
     * @return content - 文章内容txt
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置文章内容txt
     *
     * @param content 文章内容txt
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取文章内容html
     *
     * @return content_html - 文章内容html
     */
    public String getContentHtml() {
        return contentHtml;
    }

    /**
     * 设置文章内容html
     *
     * @param contentHtml 文章内容html
     */
    public void setContentHtml(String contentHtml) {
        this.contentHtml = contentHtml;
    }
}