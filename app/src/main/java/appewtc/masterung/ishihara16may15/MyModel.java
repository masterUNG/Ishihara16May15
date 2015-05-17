package appewtc.masterung.ishihara16may15;

/**
 * Created by masterUNG on 5/17/15 AD.
 */
public class MyModel {

    private int buttonAnInt;

    public interface OnMyModelChangeListener {
        void onMyModelChangeListener(MyModel myModel);
    }   // interface

    private OnMyModelChangeListener onMyModelChangeListener;

    public void setOnMyModelChangeListener(OnMyModelChangeListener onMyModelChangeListener) {
        this.onMyModelChangeListener = onMyModelChangeListener;
    }

    public int getButtonAnInt() {
        return buttonAnInt;
    }   // getter

    public void setButtonAnInt(int buttonAnInt) {
        this.buttonAnInt = buttonAnInt;

        if (this.onMyModelChangeListener != null) {

            this.onMyModelChangeListener.onMyModelChangeListener(this);

        }


    }   // setter

}   // Main Class
