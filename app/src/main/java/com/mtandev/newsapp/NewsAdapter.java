package com.mtandev.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        News currentNews = getItem(position);
        TextView newsTitleTV = (TextView) listItemView.findViewById(R.id.title_text);
        String title = currentNews.getTitle();
        newsTitleTV.setText(title);

        TextView newsCategoryTV = (TextView) listItemView.findViewById(R.id.category_tv);
        String category = currentNews.getCategory();
        newsCategoryTV.setText(category);

        TextView newsDateTV = (TextView) listItemView.findViewById(R.id.date_tv);
        String date = currentNews.getDate();
        newsDateTV.setText(date);

        TextView newsAuthorTV = (TextView) listItemView.findViewById(R.id.author_tv);
        String author = currentNews.getAuthor();

        if (author.equals("")) {
            author = getContext().getString(R.string.no_author);
        }

        newsAuthorTV.setText(author);
        return listItemView;
    }
}
