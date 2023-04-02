package model;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Division {
    private String name;
    private String code;
    private int passScore;
    private List<String> subjectCodeList;

    public Division() {
    }

    public Division(String name, String code, int passScore, List<String> subjectCodeList) {
        this.name = name;
        this.code = code;
        this.passScore = passScore;
        this.subjectCodeList = subjectCodeList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPassScore() {
        return passScore;
    }

    public void setPassScore(int passScore) {
        this.passScore = passScore;
    }

    public List<String> getSubjectCodeList() {
        return subjectCodeList;
    }

    public void setSubjectCodeList(List<String> subjectCodeList) {
        this.subjectCodeList = subjectCodeList;
    }

    @Override
    public String toString() {
        return "Division{" + "name=" + name + ", code=" + code + ", passScore=" + passScore + ", subjectCodeList=" + subjectCodeList + '}';
    }

    
}

