package com.thynkbeyond.listinloop;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Activity that shows a simple side panel UI.
 */
public class GradesActivity extends Activity {
    private GradesGrid mGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Sets the size and position of dialog activity.
        WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
        layoutParams.gravity = Gravity.END | Gravity.CENTER_VERTICAL;
        layoutParams.width = getResources().getDimensionPixelSize(R.dimen.side_panel_width);
        layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT;
        getWindow().setAttributes(layoutParams);

        setContentView(R.layout.grades_layout);

        mGrid = (GradesGrid) findViewById(R.id.list);
        AppLinkMenuAdapter appLinkMenuAdapter = new AppLinkMenuAdapter();
        mGrid.setAdapter(appLinkMenuAdapter);
    }

    /**
     * Adapter class that provides the app link menu list.
     */
    public class AppLinkMenuAdapter extends RecyclerView.Adapter<ViewHolder> {
        private static final int CLASS_COUNT = 5;
        private final int[] ITEM_STRING_RES_IDS = new int[]{R.string.grade_1, R.string.grade_2,
                R.string.grade_3, R.string.grade_4, R.string.grade_5};

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View view = getLayoutInflater().inflate(viewType, mGrid, false);
            return new ViewHolder(view);
        }

        @Override
        public int getItemViewType(int position) {
            return R.layout.grades_row_item;
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int position) {
            TextView view = (TextView) viewHolder.itemView;
            view.setText(getResources().getString(ITEM_STRING_RES_IDS[position]));
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

        @Override
        public int getItemCount() {
            return CLASS_COUNT;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
