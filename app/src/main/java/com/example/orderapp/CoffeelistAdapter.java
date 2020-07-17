package com.example.orderapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CoffeelistAdapter extends RecyclerView.Adapter<CoffeelistAdapter.CoffeelistViewHolder> {

    Context context;

    ArrayList<CoffeeVO> coffeeVOArrayList = new ArrayList<CoffeeVO>();

    OnItemClickListener clickListener;

    public static interface OnItemClickListener{
        public void OnItemClick(RecyclerView.ViewHolder holder, View view, int position);
    }

    public CoffeelistAdapter(Context context) {
        this.context = context;

    }

    @NonNull
    @Override
    public CoffeelistAdapter.CoffeelistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_coffeelist, parent, false);
        CoffeelistViewHolder coffeelistViewHolder = new CoffeelistViewHolder(view);

        return coffeelistViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeelistAdapter.CoffeelistViewHolder holder, int position) {

        final CoffeeVO coffeeVO = coffeeVOArrayList.get(position);
        holder.setItem(coffeeVO);
        holder.setOnItemClickListener(clickListener);

    }

    @Override
    public int getItemCount() {
        return coffeeVOArrayList.size();
    }

    public class CoffeelistViewHolder extends RecyclerView.ViewHolder {

        ImageView coffeeImg;
        TextView coffeeName, coffeePrice, coffeeQuantity;
        Button btnIncrement, btnDecrement;

        CoffeeVO coffeeVO;

        OnItemClickListener clickListener;

        public CoffeelistViewHolder(@NonNull final View itemView) {
            super(itemView);

            coffeeImg = (ImageView) itemView.findViewById(R.id.coffeeImg);
            coffeeName = (TextView) itemView.findViewById(R.id.coffeeName);
            coffeePrice = (TextView) itemView.findViewById(R.id.coffeePrice);
            coffeeQuantity = (TextView) itemView.findViewById(R.id.coffeeQuantity);
            btnDecrement = (Button) itemView.findViewById(R.id.btnDecrement);
            btnIncrement = (Button) itemView.findViewById(R.id.btnIncrement);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    if(clickListener != null){
                        clickListener.OnItemClick(CoffeelistViewHolder.this, v, position);
                    }
                }
            });
        }

        public void setItem(CoffeeVO coffeeVO){

//            coffeeImg
            coffeeName.setText("이름: "+coffeeVO.getCoffeeName());
            coffeePrice.setText("가격: "+coffeeVO.getCoffeePrice());
            coffeeQuantity.setText("수: "+coffeeVO.getCoffeeQuantity());
        }

        public void setOnItemClickListener(OnItemClickListener clickListener){
            this.clickListener = clickListener;
        }
    }

    public void addItem(CoffeeVO coffeeVO){
        coffeeVOArrayList.add(coffeeVO);
    }

    public CoffeeVO getItem(int position){
        return coffeeVOArrayList.get(position);
    }


}
