package yonky.pintitlescroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import yonky.pintitlescroll.pin_title_scroll.ScrollablePanel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScrollablePanel scrollablePanel = (ScrollablePanel) findViewById(R.id.scrollable_panel);
        ScrollablePanelAdapter adapter = new ScrollablePanelAdapter();
        scrollablePanel.setPanelAdapter(adapter);
    }


}
