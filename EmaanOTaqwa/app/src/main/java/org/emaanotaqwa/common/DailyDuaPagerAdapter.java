package org.emaanotaqwa.common;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import org.emaanotaqwa.R;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by MJunaid on 9/11/2016.
 */
public class DailyDuaPagerAdapter extends PagerAdapter {

    private Context mContext;
    private Calendar currentDate;

    public DailyDuaPagerAdapter(Context context) {
        mContext = context;
        currentDate = Calendar.getInstance();
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        //ModelObject modelObject = ModelObject.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.image_view_1, collection, false);
        ImageView imageView = (ImageView)layout.findViewById(R.id.image);
        String pageName = Configuration.getDayPrefix(currentDate)+(getCount() - position);
        int pageId = mContext.getResources().getIdentifier(pageName, "drawable", "org.emaanotaqwa");
        Glide.with(mContext)
                .load(pageId)
                .into(imageView);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return Configuration.getImageCount(currentDate);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


}
