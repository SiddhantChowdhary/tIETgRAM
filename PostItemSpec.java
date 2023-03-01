package com.siddhant.socail2;

import android.graphics.Typeface;

import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Image;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaEdge;
import static com.facebook.litho.widget.Image.Builder.*;

@LayoutSpec
public class PostItemSpec  {

    @Prop
    String name;

    @Prop
    String description;

    @Prop
    String imageUrl;

    @Override
    protected Component onCreateLayout(ComponentContext c) {
        // your code here
    }
}


 */
