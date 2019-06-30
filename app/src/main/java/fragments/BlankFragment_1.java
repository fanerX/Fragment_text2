package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.fragment_text.R;

import java.util.ArrayList;
import java.util.List;

import classes.Fruit;
import classes.FruitAdapter;

public class BlankFragment_1 extends Fragment {
    private List<Fruit> fruitList =new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank_fragment_1, container, false);
        initFruits();
        FruitAdapter adapter =new FruitAdapter(getActivity(),R.layout.fruit,fruitList);
        ListView listView = view.findViewById(R.id.listView);
        listView.setAdapter(adapter);
        return view;
    }
    private void  initFruits(){
        for (int i=0 ;i<15; i++){
            Fruit fruit =new Fruit("白羊座",R.drawable.sheep);
            fruitList.add(fruit);
        }
    }

}
