package com.app01.kfc.bean;

public class Category {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kfc_category.id
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kfc_category.name
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kfc_category.icon
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    private String icon;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kfc_category.id
     *
     * @return the value of kfc_category.id
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kfc_category.id
     *
     * @param id the value for kfc_category.id
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kfc_category.name
     *
     * @return the value of kfc_category.name
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kfc_category.name
     *
     * @param name the value for kfc_category.name
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kfc_category.icon
     *
     * @return the value of kfc_category.icon
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kfc_category.icon
     *
     * @param icon the value for kfc_category.icon
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}