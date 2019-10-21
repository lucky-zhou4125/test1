package cn.itcast.git;

import java.util.Date;
import java.util.Objects;

/**
 * @Discription
 * @Author rio
 * @Date 2019/10/12 7:52
 */
public class Student {

    public String username;
    public Integer age;
    public Date createdTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(username, student.username) &&
                Objects.equals(age, student.age) &&
                Objects.equals(createdTime, student.createdTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, age, createdTime);
    }


}
