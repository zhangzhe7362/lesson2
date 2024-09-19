package com.zz.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 *
 * @author 张哲
 * @email a252013135@163.com
 * @date 2024/9/18 8:50
 */
@Entity
@Table(name = "t_user")
@JsonIgnoreProperties(value =
        {"hibernate_sequence", "handler", "hibernateLazyInitializer"})
@SuppressWarnings("all")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "username", nullable = true, length = 32)
    private String username;
    @Column(name = "password", nullable = true, length =32)
    private String password;
    @Column(name = "age", nullable = true, length =11)
    private Integer age;
    @Column(name = "sex", nullable = true, length = 11)
    private Integer sex;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String username, String password, Integer age, Integer sex) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append('}');
        return sb.toString();
    }
}
