package c.materialdesign;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by abhi on 28/12/17.
 */

class RecyclerAdaptor extends RecyclerView.Adapter<RecyclerAdaptor.ViewHolder> {

//string value for card view
    private String[] text={"Alpha", "Beta",
            "Cupcake", "Donut",
            "Eclair", "Freyo",
            "Ginger Bread","HoneyComb",
            "Icecream Sandwitch","Jelly beans",
            "Kitkat","Lollipop",
            "Mashmallow","Nugut","Oreo"};

    //creat view holder to attach card_row.xml to view holder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_row,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }
    //providing them value to element of card view

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.cardtext.setText(text[i]);
    }

    @Override
    public int getItemCount() {
        return text.length;
    }


    // getting elements in card view
    public class ViewHolder extends RecyclerView.ViewHolder {

        public int currentitem;
        public TextView cardtext;

        public ViewHolder(View itemView) {
            super(itemView);
            cardtext=itemView.findViewById(R.id.card_text);
        }
    }
}
