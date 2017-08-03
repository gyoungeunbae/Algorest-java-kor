package adapters;

/**
 * Created by baegyeong-eun on 2017. 8. 3..
 */
import entities.*;
import java.util.*;

import android.content.*;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.*;
import android.widget.*;

import com.example.baegyeong_eun.tutorial5.R;

public class ProductListAdapter extends ArrayAdapter<Product>{
    private Context context;
    private  List<Product> products;
    public ProductListAdapter(Context context, List<Product> products) {
        super(context, R.layout.product_list_layout, products);
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.product_list_layout,parent,false);
        ImageView imageViewPhoto = (ImageView) view.findViewById(R.id.imageView);
        imageViewPhoto.setImageResource(products.get(position).getPhoto());
        TextView textViewname = view.findViewById(R.id.textViewName);
        textViewname.setText(products.get(position).getName());
        TextView textViewPrice = view.findViewById(R.id.textViewPrice);
        textViewPrice.setText(String.valueOf(products.get(position).getPrice()));
        return view;
    }
}
