package com.jnmd.bluesky.domain;

import java.util.Date;
import java.util.List;

public class Activity {

    private int aid;
    private String title;
    private String content;
    private User user;
    private Date start;
    private Date end;
    private String address;
    private String information;
    private List<ActivityUser> activityUsers;
    public Activity() {
        super();
    }
    public Activity(String title, String content, User user, Date start, Date end, String address,
            String information, List<ActivityUser> activityUsers) {
        super();
        this.title = title;
        this.content = content;
        this.user = user;
        this.start = start;
        this.end = end;
        this.address = address;
        this.information = information;
        this.activityUsers = activityUsers;
    }
    public Activity(int aid, String title, String content, User user, Date start, Date end, String address,
            String information, List<ActivityUser> activityUsers) {
        super();
        this.aid = aid;
        this.title = title;
        this.content = content;
        this.user = user;
        this.start = start;
        this.end = end;
        this.address = address;
        this.information = information;
        this.activityUsers = activityUsers;
    }
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Date getStart() {
        return start;
    }
    public void setStart(Date start) {
        this.start = start;
    }
    public Date getEnd() {
        return end;
    }
    public void setEnd(Date end) {
        this.end = end;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getInformation() {
        return information;
    }
    public void setInformation(String information) {
        this.information = information;
    }
    public List<ActivityUser> getActivityUsers() {
        return activityUsers;
    }
    public void setActivityUsers(List<ActivityUser> activityUsers) {
        this.activityUsers = activityUsers;
    }
    @Override
    public String toString() {
        return "Activity [aid=" + aid + ", title=" + title + ", content=" + content + ", user=" + user
                + ", start=" + start + ", end=" + end + ", address=" + address + ", information="
                + information + ", activityUsers=" + activityUsers + "]";
    }
    
    
}
