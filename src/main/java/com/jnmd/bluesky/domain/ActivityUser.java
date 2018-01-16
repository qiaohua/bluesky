package com.jnmd.bluesky.domain;

public class ActivityUser {

    private int auid;
    private Activity activity;
    private User user;
    public ActivityUser() {
        super();
    }
    public ActivityUser(Activity activity, User user) {
        super();
        this.activity = activity;
        this.user = user;
    }
    public ActivityUser(int auid, Activity activity, User user) {
        super();
        this.auid = auid;
        this.activity = activity;
        this.user = user;
    }
    public int getAuid() {
        return auid;
    }
    public void setAuid(int auid) {
        this.auid = auid;
    }
    public Activity getActivity() {
        return activity;
    }
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public String toString() {
        return "ActivityUser [auid=" + auid + ", activity=" + activity + ", user=" + user + "]";
    }
    
    
}
