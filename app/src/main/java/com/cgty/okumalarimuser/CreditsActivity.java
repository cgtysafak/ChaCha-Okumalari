package com.cgty.okumalarimuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class CreditsActivity extends AppCompatActivity
{
    private static final String TAG = "CreditsActivity";
    //Layouts
    LinearLayout githubLayout;
    LinearLayout youTubeLayout;
    LinearLayout instagramLayout;
    LinearLayout twitterLayout;
    LinearLayout discordLayout;
    //Ads...
    private AdView mAdView;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    
        //Ads...
        mAdView = findViewById(R.id.adView_credits);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        
        githubLayout = findViewById(R.id.githubLayout);
        youTubeLayout = findViewById(R.id.youTubeLayout);
        instagramLayout = findViewById(R.id.instagramLayout);
        twitterLayout = findViewById(R.id.twitterLayout);
        discordLayout = findViewById(R.id.discordLayout);
    
        githubLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent github;
            
                github = new Intent(Intent.ACTION_VIEW);
                github.setData(Uri.parse("https://github.com/cgtysafak"));
            
                startActivity(github);
            }
        });
    
        youTubeLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent github;
            
                github = new Intent(Intent.ACTION_VIEW);
                github.setData(Uri.parse("https://www.youtube.com/channel/UC3-qx8Hm1UdDgeNSa2ZzcZA?view_as=subscriber"));
            
                startActivity(github);
            }
        });
    
        instagramLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent github;
            
                github = new Intent(Intent.ACTION_VIEW);
                github.setData(Uri.parse("https://www.instagram.com/cgtysafak"));
            
                startActivity(github);
            }
        });
    
        twitterLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent github;
            
                github = new Intent(Intent.ACTION_VIEW);
                github.setData(Uri.parse("https://www.twitter.com/cgtysafak"));
            
                startActivity(github);
            }
        });
    
        discordLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // empty for now...
            }
        });
    }
}