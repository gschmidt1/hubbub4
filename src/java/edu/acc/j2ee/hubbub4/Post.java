package edu.acc.j2ee.hubbub4;

import java.util.Date;

public class Post implements java.io.Serializable {
    private String content;
    private Date postDate;
    private User author;
    private int id;
    private Profile profile;
    
    public Post(String content, Date postDate, User author, Profile profile) {
        this.content = content;
        this.postDate = postDate;
        this.author = author;
        this.profile = profile;
    }
    
    public Post(String content, Date postDate, User author, Profile profile, int id) {
        this(content, postDate, author, profile);
        this.id = id;
    }
    
    public Post() {}

    public String getContent() {
        return content;
    }

    public Date getPostDate() {
        return postDate;
    }
    
    public int getId() {
        return id;
    }
    
    public User getAuthor() {
        return author;
    }
    public Profile getProfile() {
        return profile;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setAuthor(User author) {
        this.author = author;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    @Override
    public String toString() {
        return String.format("%d characters posted by User %s on %s",
                content.length(), author, postDate);
    }

    

    
}