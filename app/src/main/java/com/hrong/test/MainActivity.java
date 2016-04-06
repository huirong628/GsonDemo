package com.hrong.test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.hrong.test.bean.FeedBean;
import com.hrong.test.bean.FeedListBean;
import com.hrong.test.protocol.parser.ParserHelper;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //使用方法
        String json = "{\n" +
                "    \"retcode\": 0,\n" +
                "    \"errcode\": 100,\n" +
                "    \"feedslist\": [\n" +
                "        {\n" +
                "            \"id\": \"1459845875278\",\n" +
                "            \"author_name\": \"zxd8511\",\n" +
                "            \"author_head\": \"http://u1.qhimg.com/qhimg/quc/150_150/22/02/55/220255dq9816.9f8902.jpg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"1459823041738\",\n" +
                "            \"author_name\": \"zhr0628\",\n" +
                "            \"author_head\": \"http://quc.qhimg.com/dm/150_150_100/t014abe9a7b278b055f.jpg\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        int errCode = -1;
        boolean success = false;
        FeedListBean feedListBean = null;
        try {
            ParserHelper<FeedListBean> parserHelper = new ParserHelper<FeedListBean>(FeedListBean.class);
            feedListBean = parserHelper.getBean(json);
            if (feedListBean.getRetCode() == 0) {
                success = true;
            } else {
                success = false;
                errCode = feedListBean.getErrCode();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (success) {
            List<FeedBean> feedList = feedListBean.getFeedList();
            //update ui
        } else {
            //show errcode for user
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
