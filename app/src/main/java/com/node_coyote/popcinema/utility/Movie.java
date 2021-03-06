package com.node_coyote.popcinema.utility;

/**
 * Created by node_coyote on 5/3/17.
 */

/**
 * An object to hold and pass around movies
 */
public class Movie {

    private String mPosterPath;
    private String mSummary;
    private String mTitle;
    private String mRelease;
    private double mTopRated;

    public Movie(String poster, String summary, String title, String release, double topRated) {
        mPosterPath = poster;
        mSummary = summary;
        mTitle = title;
        mRelease = release;
        mTopRated = topRated;
    }

    public String getPosterPath(){
        return mPosterPath;
    }

    public String getSummary(){
        return mSummary;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getRelease(){
        return mRelease;
    }

    public String getTopRated(){
        String rated = String.valueOf(mTopRated);
        return rated;
    }
}
