package com.londonappbrewery.destini;

/**
 * Created by rocka on 2017-10-23.
 */

public class StoryPoint {


    private int mStoryID;
    private int mAns1ID;
    private int mAns2ID;


    public StoryPoint (int StoryID, int Ans1, int Ans2)
    {
        mStoryID = StoryID;
        mAns1ID = Ans1;
        mAns2ID = Ans2;
    }

    public StoryPoint (int StoryID)
    {
        mStoryID= StoryID;
    }

    public int getStoryID() {
        return mStoryID;
    }


    public int getAns1ID() {
        return mAns1ID;
    }


    public int getAns2ID() {
        return mAns2ID;
    }




}
