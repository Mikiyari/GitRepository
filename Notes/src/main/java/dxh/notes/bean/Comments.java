package dxh.notes.bean;

import java.util.Date;

public class Comments {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.id
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.author
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    private Integer author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.target
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    private Integer target;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.content
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.createtime
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.id
     *
     * @return the value of comments.id
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.id
     *
     * @param id the value for comments.id
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.author
     *
     * @return the value of comments.author
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public Integer getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.author
     *
     * @param author the value for comments.author
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public void setAuthor(Integer author) {
        this.author = author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.target
     *
     * @return the value of comments.target
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public Integer getTarget() {
        return target;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.target
     *
     * @param target the value for comments.target
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public void setTarget(Integer target) {
        this.target = target;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.content
     *
     * @return the value of comments.content
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.content
     *
     * @param content the value for comments.content
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.createtime
     *
     * @return the value of comments.createtime
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.createtime
     *
     * @param createtime the value for comments.createtime
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}