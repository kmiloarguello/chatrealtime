package xyz.camiloarguello.chatrealtime.ui.adapters;

import android.support.v7.widget.RecyclerView;

import java.util.List;

import xyz.camiloarguello.chatrealtime.models.Chat;

/**
 * Created by Camilo Arguello R on 2017-11-16.
 */

public class ChatRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int VIEW_TYPE_ME = 1;
    private static final int VIEW_TYPE_OTHER = 2;

    private List<Chat> mChats;


}
