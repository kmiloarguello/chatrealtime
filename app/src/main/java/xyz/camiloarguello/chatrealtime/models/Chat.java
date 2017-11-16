package xyz.camiloarguello.chatrealtime.models;

/**
 * Created by Camilo Arguello R on 2017-11-16.
 */

public class Chat {
    public String sender, receiver, senderUid, receiverUid, message;
    public long timestamp;

    public Chat(String sender, String receiver, String senderUid, String receiverUid, String message, long timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.senderUid = senderUid;
        this.receiverUid = receiverUid;
        this.message = message;
        this.timestamp = timestamp;
    }
}
