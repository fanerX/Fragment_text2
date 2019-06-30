package fragments;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fragment_text.R;


public class BlankFragment_3 extends Fragment {
    static  int flag= 0;
    private int[] imageViews=new int[]{
            R.drawable.chu_yin_4,
            R.drawable.chu_yin_2,
            R.drawable.chu_yin_3,
    };
    private  int[] textViews=new int[]{
            R.string.chu_1,
            R.string.chu_2,
            R.string.chu_3
    };
    private ImageView imageView;
    private TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            imageView.setImageResource(imageViews[flag]);
            textView.setText(textViews[flag++]);
            flag %=3;
        }
    };



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank_fragment_3, container, false);
        imageView= view.findViewById(R.id.image_3);
        textView=view.findViewById(R.id.text_3);
        new Thread(){
            @Override
            public void run() {
                while (true){
                    handler.sendMessage(new Message());
                    try {
                        sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        return view;
    }


}
