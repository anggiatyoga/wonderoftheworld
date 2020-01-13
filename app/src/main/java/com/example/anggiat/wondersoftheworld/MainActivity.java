package com.example.anggiat.wondersoftheworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<Object> listObject = new ArrayList<>();
    private RecyclerView rvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        rvObject = findViewById(R.id.rv_object);
        rvObject.setHasFixedSize(true);

        listObject.addAll(ObjectData.getListData());

        showRecyclerList();

    }

    private void showRecyclerList(){
        rvObject.setLayoutManager(new LinearLayoutManager(this));
        ListViewObjectAdapter listViewObjectAdapter = new ListViewObjectAdapter(listObject);
        rvObject.setAdapter(listViewObjectAdapter);

        setAnimation(R.anim.layout_animation_left_to_right);
    }

    private void showRecylerGrid(){
        rvObject.setLayoutManager(new GridLayoutManager(this, 2));
        GridViewObjectAdapter gridViewObjectAdapter = new GridViewObjectAdapter(listObject);
        rvObject.setAdapter(gridViewObjectAdapter);

        setAnimation(R.anim.layout_animation_down_to_up);
    }

    private void setAnimation(int animation) {
        final LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(this, animation);
        rvObject.setLayoutAnimation(controller);
        rvObject.getAdapter().notifyDataSetChanged();
        rvObject.scheduleLayoutAnimation();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_list_on:
                showRecyclerList();
                break;
            case R.id.menu_grid_on:
                showRecylerGrid();
                break;
            case R.id.menu_intent_about:
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            break;
        }
        return super.onOptionsItemSelected(item);
    }
}
