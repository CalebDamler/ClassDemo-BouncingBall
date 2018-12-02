package edu.niu.cs.caleb.bouncingball;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

/**
 * Created by z1731660 on 4/13/2017.
 */
public class BounceThread extends Thread {

    private SurfaceHolder surfaceHolder;
    private animationArena animationArena;
    private boolean isRun;

    public BounceThread(SurfaceHolder sh) {
        surfaceHolder = sh;
        animationArena = new animationArena();
        isRun = true;
    }

    public void run(){
        try {
        while (isRun){
            Canvas canvas = surfaceHolder.lockCanvas();
            animationArena.update(canvas.getWidth(), canvas.getHeight());
            animationArena.draw(canvas);
            surfaceHolder.unlockCanvasAndPost(canvas);
        }
        }catch (NullPointerException e){
            e.printStackTrace();

        }
    }
    public void endBounce(){
        isRun = false;
    }


}
