package com.example.claude.interactivestory.model;

/**
 * Created by claude on 3/25/15.
 */
public class Choice {

    private String mText;
    private String mNextPage;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getNextPage() {
        return mNextPage;
    }

    public void setNextPage(String nextPage) {
        mNextPage = nextPage;
    }
}
