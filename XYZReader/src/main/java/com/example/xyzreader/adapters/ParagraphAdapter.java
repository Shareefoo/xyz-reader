package com.example.xyzreader.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

public class ParagraphAdapter extends RecyclerView.Adapter<ParagraphAdapter.ViewHolder> {

    private String[] mParagraphs;

    public ParagraphAdapter(Context context, String[] paragraphs) {
        this.mParagraphs = paragraphs;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item_paragraph, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String paragraph = mParagraphs[position];

        holder.textViewParagraph.setText(paragraph);
    }

    @Override
    public int getItemCount() {
        return mParagraphs.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewParagraph;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewParagraph = (TextView) itemView.findViewById(R.id.textView_paragraph);
        }

    }

}
