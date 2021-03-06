package cn.linhome.pulltorefresh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.linhome.library.activity.SDBaseActivity;
import cn.linhome.pulltorefresh.activity.ButtonActivity;
import cn.linhome.pulltorefresh.activity.FullRecyclerViewActivity;
import cn.linhome.pulltorefresh.activity.ListViewActivity;
import cn.linhome.pulltorefresh.activity.RecyclerViewActivity;
import cn.linhome.pulltorefresh.activity.ScrollViewActivity;

public class MainActivity extends SDBaseActivity
{

    @Override
    protected void init(Bundle savedInstanceState)
    {
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_button).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, ButtonActivity.class));
            }
        });

        findViewById(R.id.btn_recyclerview).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
            }
        });

        findViewById(R.id.btn_full_recyclerview).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, FullRecyclerViewActivity.class));
            }
        });

        findViewById(R.id.btn_listview).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, ListViewActivity.class));
            }
        });

        findViewById(R.id.btn_scrollview).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, ScrollViewActivity.class));
            }
        });
    }
}
