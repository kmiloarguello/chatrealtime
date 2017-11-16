package xyz.camiloarguello.chatrealtime.models;

/**
 * Created by Camilo Arguello R on 2017-11-16.
 */

public class Users {
    private String emailId, lastMessage;
    private  int notifCount;

    public String getEmailId() { return emailId; }

    public void setEmailId() { this.emailId = emailId; }

    public String getLastMessage(){ return  lastMessage; };

    public void setLastMessage(){ this.lastMessage = lastMessage; }

    public int getNotifCount(){ return  notifCount; }

    public void setNotifCount(int notifCount) { this.notifCount = notifCount; }
}
