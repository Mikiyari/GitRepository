package dxh.notes.bean;

public class Studyquestions {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studyquestions.id
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studyquestions.author
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    private Integer author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studyquestions.question
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    private String question;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studyquestions.content
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studyquestions.status
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studyquestions.id
     *
     * @return the value of studyquestions.id
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studyquestions.id
     *
     * @param id the value for studyquestions.id
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studyquestions.author
     *
     * @return the value of studyquestions.author
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public Integer getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studyquestions.author
     *
     * @param author the value for studyquestions.author
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public void setAuthor(Integer author) {
        this.author = author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studyquestions.question
     *
     * @return the value of studyquestions.question
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public String getQuestion() {
        return question;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studyquestions.question
     *
     * @param question the value for studyquestions.question
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studyquestions.content
     *
     * @return the value of studyquestions.content
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studyquestions.content
     *
     * @param content the value for studyquestions.content
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studyquestions.status
     *
     * @return the value of studyquestions.status
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studyquestions.status
     *
     * @param status the value for studyquestions.status
     *
     * @mbg.generated Mon Oct 22 11:16:56 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}