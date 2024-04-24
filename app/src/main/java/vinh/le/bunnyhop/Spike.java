package vinh.le.bunnyhop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Spike {
    Bitmap spike [] = new Bitmap[3];
    int spikeFrame = 0;

    int spikeX, spikeY, spikeVelocity;

    Random random;

    public Spike (Context context) {
        spike [0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.spike0);
        spike [1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.spike1);
        spike [2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.spike2);
        random = new Random();
        resetPosition();
    }

    private void resetPosition() {
    }

}
