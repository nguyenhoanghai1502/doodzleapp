package com.deitel.paittig;

import com.deitel.doodlz.R;

public class BackgroundColorDialogFragment extends ColorDialogFragment {
    @Override
    protected int getTitle() {
        return R.string.title_background_color_dialog;
    }

    @Override
    protected int getColorDoodleView(DoodleView doodleView){
        return doodleView.getDrawingBackgroundColor();
    }
    @Override
    protected void setColorDoodleView(DoodleView doodleView) {
        doodleView.setDrawingBackgroundColor(color);
    }
}
