package yonky.pintitlescroll;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import yonky.pintitlescroll.pin_title_scroll.PanelAdapter;

/**
 * Created by Administrator on 2017/12/6.
 */
public class ScrollablePanelAdapter extends PanelAdapter {
    private static final int TITLE_TYPE = 4;
    private static final int ROOM_TYPE = 0;
    private static final int DATE_TYPE = 1;
    private static final int ORDER_TYPE = 2;

//    private List<Integer> roomInfoList=new ArrayList<>();
//    private List<DateInfo> dateInfoList = new ArrayList<>();
//    private List<List<OrderInfo>> ordersList =new ArrayList<>();


    @Override
    public int getRowCount() {
        return 20;
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int row, int column) {
        int viewType = getItemViewType(row, column);
       switch(viewType){
           case TITLE_TYPE:
               break;
           case ROOM_TYPE:
               ((DateViewHolder)holder).item.setText(row+"");
               break;
           case DATE_TYPE:
               ((DateViewHolder)holder).item.setText(column+"");
               break;
           case ORDER_TYPE:
               ((DateViewHolder)holder).item.setText(row+""+column);
               break;
           default:
               break;
       }

    }

    public int getItemViewType(int row, int column) {
        if (column == 0 && row == 0) {
            return TITLE_TYPE;
        }
        if (column == 0) {
            return ROOM_TYPE;
        }
        if (row == 0) {
            return DATE_TYPE;
        }
        return ORDER_TYPE;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

                return new DateViewHolder(LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item, parent, false));
    }


    private static class DateViewHolder extends RecyclerView.ViewHolder {
        public TextView item;
        public DateViewHolder(View view) {
            super(view);
            this.item = (TextView) view.findViewById(R.id.item);
        }
    }




//    public void setDateInfoList(List<DateInfo> dateInfoList) {
//        this.dateInfoList = dateInfoList;
//    }


}

