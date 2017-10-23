package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;

    int mCurrentStoryPoint = 1;
    int mCurrentStoryIndex = mCurrentStoryPoint -1;
    final String Ans1 = "Ans1";
    final String Ans2 = "Ans2";

    private StoryPoint storyLine[] = {
            new StoryPoint (R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new StoryPoint (R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new StoryPoint (R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
            new StoryPoint (R.string.T4_End),
            new StoryPoint (R.string.T5_End),
            new StoryPoint (R.string.T6_End)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStoryTextView.setText(storyLine[mCurrentStoryIndex].getStoryID());


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressStory(Ans1);

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressStory(Ans2);
            }
        });



    }

    private void setStoryPoint(int StoryPoint)
    {
        mCurrentStoryPoint = StoryPoint;
        mCurrentStoryIndex=StoryPoint - 1;
        mStoryTextView.setText(storyLine[mCurrentStoryIndex].getStoryID()) ;

        if (mCurrentStoryPoint == 1 || mCurrentStoryPoint== 2 || mCurrentStoryPoint== 3) {
            mButtonTop.setText(storyLine[mCurrentStoryIndex].getAns1ID());
            mButtonBottom.setText(storyLine[mCurrentStoryIndex].getAns2ID());
       }
        else
        {
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }
    }


    private void progressStory(String choice)
    {

        if (mCurrentStoryPoint==1 && choice==Ans1)
        {
            setStoryPoint(3);

        }

        else if (mCurrentStoryPoint==1 && choice==Ans2)
        {
            setStoryPoint(2);
        }

        else if (mCurrentStoryPoint==2 && choice==Ans1)
        {
            setStoryPoint(3);
        }

        else if (mCurrentStoryPoint==2 && choice==Ans2)
        {
            setStoryPoint(4);
        }

        else if (mCurrentStoryPoint==3 && choice==Ans1)
        {
            setStoryPoint(6);
        }

        else if (mCurrentStoryPoint==3 && choice==Ans2)
        {
            setStoryPoint(5);
        }


    }








    }


