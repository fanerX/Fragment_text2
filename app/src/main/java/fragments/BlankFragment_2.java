package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.fragment_text.R;

import java.util.ArrayList;
import java.util.List;

import classes.Fruit;
import classes.FruitRecyclerAdapter;


public class BlankFragment_2 extends Fragment {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank_fragment_2, container, false);
        initFruits();
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        FruitRecyclerAdapter adapter = new FruitRecyclerAdapter(fruitList);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void  initFruits(){
        for (int i=0 ;i<15; i++){
            Fruit fruit =new Fruit("白羊座",R.drawable.sheep);
            fruitList.add(fruit);
        }
    }

}
