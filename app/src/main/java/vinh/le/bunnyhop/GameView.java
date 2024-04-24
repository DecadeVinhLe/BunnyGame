package vinh.le.bunnyhop;

import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.graphics.Bitmap;
import android.content.Context;

import java.util.ArrayList;
import java.util.Random;

public class GameView extends View {

    Bitmap background, ground, rabbit;
    Rect rectBackground, rectGround;
    Context context;
    Handler handler;

    final long UPDATE_MILLIS = 30;
    Runnable runnable;
    Paint textPaint = new Paint();
    Paint healthPaint = new Paint();
    float TEXT_SIZE = 120;

    int points = 0;
    int life = 3;

    static int dWidth, dHeight;
    Random random;

    float rabbitX, rabbitY;
    float oldX;
    float oldRabbitX;
    ArrayList<Spike> spikes;
    ArrayList<Explosion> explosions;


    public GameView(Context context){
        super(context);
        this.context = context;
        background = BitmapFactory.decodeResource(getResources(),R.drawable.background);

    }

}
